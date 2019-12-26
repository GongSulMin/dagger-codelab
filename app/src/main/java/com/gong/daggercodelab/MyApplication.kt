package com.gong.daggercodelab

import android.app.Application
import com.gong.daggercodelab.data.UserManager
import com.gong.daggercodelab.data.storage.SharedPreferencesStorage

class MyApplication : Application() {

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}