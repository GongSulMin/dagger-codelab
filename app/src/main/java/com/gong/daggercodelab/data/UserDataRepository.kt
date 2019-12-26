package com.gong.daggercodelab.data

import kotlin.random.Random

class UserDataRepository(private val userManager: UserManager) {

    val username: String
        get() = userManager.userName

    var unreadNotifications: Int

    init {
        unreadNotifications = randomInt()
    }

    fun refreshUnreadNotifications() {
        unreadNotifications = randomInt()
    }
}

fun randomInt(): Int {
    return Random.nextInt(until = 100)
}
