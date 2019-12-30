package com.gong.daggercodelab

import android.app.Application
import com.gong.daggercodelab.data.UserManager
import com.gong.daggercodelab.data.storage.SharedPreferencesStorage
import com.gong.daggercodelab.di.AppComponent
import com.gong.daggercodelab.di.DaggerAppComponent

class MyApplication : Application() {

    val appComponent: AppComponent by lazy {

//        DaggerAppComponent
//            .builder()
//            .application(applicationContext)
//            .build()
        DaggerAppComponent
            .factory()
            .create(applicationContext)
    }

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}