package com.hola.loginverification

class LoginVerification {
    fun verifyEmailAndPassword(email: String, password: String): Boolean {
        return email == "test@holaola.com"
        password == "test123"
    }
}