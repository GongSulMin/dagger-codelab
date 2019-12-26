package com.gong.daggercodelab.main

import com.gong.daggercodelab.data.UserDataRepository

class MainVIewModel(private val userDataRepository: UserDataRepository) {

    val welcomeText: String
        get() = "Hello ${userDataRepository.username}"

    val notificationsTest: String
        get() = "You have ${userDataRepository.unreadNotifications} unread noticiations"

}