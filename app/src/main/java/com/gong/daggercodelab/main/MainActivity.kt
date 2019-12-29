package com.gong.daggercodelab.main

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gong.daggercodelab.MyApplication
import com.gong.daggercodelab.R
import com.gong.daggercodelab.data.UserManager
import com.gong.daggercodelab.login.LoginActivity
import com.gong.daggercodelab.registration.RegistrationActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainVIewModel

    @Inject
    lateinit var userManager: UserManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as MyApplication).appComponent.inject(this)
        if (!userManager.isUserLoggedIn()) {

            if (!userManager.isUserRegistered()) {
                startActivity(Intent(this, RegistrationActivity::class.java))
                finish()
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }

        } else {
            setContentView(R.layout.activity_main)

            mainViewModel = MainVIewModel(userManager.userDataRepository!!)
            setupViews()
        }

    }

    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.notifications).text = mainViewModel.notificationsTest
    }

    private fun setupViews() {
        hello.text = mainViewModel.welcomeText
        logout.setOnClickListener {
            //            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}
