package com.hola.loginverification

class LoginVerification {
    fun verify(email: String, password: String): Boolean {
        return email == "test@holaola.com" &&
                password == "test123"
    }
}