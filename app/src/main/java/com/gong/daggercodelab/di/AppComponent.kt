package com.gong.daggercodelab.di

import android.content.Context
import com.gong.daggercodelab.main.MainActivity
import com.gong.daggercodelab.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(context: Context): Builder
//        fun build(): AppComponent
//    }



    fun inject(activity: RegistrationActivity)
    fun inject(activity: MainActivity)

}