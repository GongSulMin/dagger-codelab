package com.gong.daggercodelab.registration

import androidx.lifecycle.ViewModel
import com.gong.daggercodelab.data.UserManager
import javax.inject.Inject

class RegistrationViewModel @Inject constructor(val userManager: UserManager) : ViewModel() {

    private var userName: String? = null
    private var password: String? = null
    private var acceptedTcs: Boolean? = null

    fun updateUserData(userName: String, password: String) {
        this.userName = userName
        this.password = password
    }

    fun acceptTCs() {
        acceptedTcs = true
    }

    fun registerUser() {
        assert(userName != null)
        assert(password != null)
        assert(acceptedTcs == true)
        userManager.registerUser(userName!!, password!!)
    }

}