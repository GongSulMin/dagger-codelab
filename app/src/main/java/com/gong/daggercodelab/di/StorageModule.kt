package com.gong.daggercodelab.di

import com.gong.daggercodelab.data.storage.SharedPreferencesStorage
import com.gong.daggercodelab.data.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {

    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

}