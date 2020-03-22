package com.hola.loginverification

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return email == "test@holaola.com" &&
                password == "test123"
    }
}