package com.gong.daggercodelab.main

import com.gong.daggercodelab.data.UserDataRepository
import javax.inject.Inject

class MainVIewModel @Inject constructor(private val userDataRepository: UserDataRepository) {

    val welcomeText: String
        get() = "Hello ${userDataRepository.username}"

    val notificationsTest: String
        get() = "You have ${userDataRepository.unreadNotifications} unread noticiations"

}