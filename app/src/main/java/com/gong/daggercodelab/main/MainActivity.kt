package com.gong.daggercodelab.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gong.daggercodelab.MyApplication
import com.gong.daggercodelab.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainVIewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userManager = (application as MyApplication).userManager
        if (!userManager.isUserLoggedIn()) {

        } else {
            setContentView(R.layout.activity_main)

            mainViewModel = MainVIewModel(userManager.userDataRepository!!)
            setupViews()
        }

    }

    override fun onResume() {
        super.onResume()
        notifications.text = mainViewModel.notificationsTest
    }

    private fun setupViews() {
        hello.text = mainViewModel.welcomeText
        logout.setOnClickListener {
            //            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}
