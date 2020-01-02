package com.gong.daggercodelab.registration

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gong.daggercodelab.MyApplication
import com.gong.daggercodelab.R
import com.gong.daggercodelab.di.RegistrationComponent
import com.gong.daggercodelab.main.MainActivity
import com.gong.daggercodelab.registration.enterdetails.EnterDetailsFragment
import com.gong.daggercodelab.registration.termsandconditions.TermsAndConditionsFragment
import javax.inject.Inject

class RegistrationActivity : AppCompatActivity() {

    @Inject
    lateinit var registrationViewModel: RegistrationViewModel

    lateinit var registrationComponent: RegistrationComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        registrationComponent = (application as MyApplication).appComponent
            .registrationComponent().create()

        registrationComponent.inject(this)

        registrationViewModel = RegistrationViewModel((application as MyApplication).userManager)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_holder, EnterDetailsFragment())
            .commit()
    }

    fun onDetailsEntered() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_holder, TermsAndConditionsFragment())
            .addToBackStack(TermsAndConditionsFragment::class.java.simpleName)
            .commit()
    }

    fun onTermsAndConditionsAccepted() {
        registrationViewModel.registerUser()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

}