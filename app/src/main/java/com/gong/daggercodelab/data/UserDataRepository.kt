package com.gong.daggercodelab.data

import javax.inject.Inject
import kotlin.random.Random

class UserDataRepository @Inject constructor(private val userManager: UserManager) {

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
