package com.gong.daggercodelab.di

import com.gong.daggercodelab.registration.RegistrationActivity
import com.gong.daggercodelab.registration.enterdetails.EnterDetailsFragment
import com.gong.daggercodelab.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface RegistrationComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)

}