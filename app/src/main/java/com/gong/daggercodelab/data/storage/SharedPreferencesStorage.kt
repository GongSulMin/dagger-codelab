package com.gong.daggercodelab.data.storage

import android.content.Context
import javax.inject.Inject

class SharedPreferencesStorage @Inject constructor(context: Context) : Storage {

    private val sharedPreferences =
        context.getSharedPreferences(KEY_SHARED_DAGGER, Context.MODE_PRIVATE)

    override fun setString(key: String, value: String) {
        with(sharedPreferences.edit()) {
            putString(key, value)
            apply()
        }
    }

    override fun getString(key: String): String {
        return sharedPreferences.getString(key, "")!!
    }

    companion object {
        val KEY_SHARED_DAGGER = "Dagger"
    }

}