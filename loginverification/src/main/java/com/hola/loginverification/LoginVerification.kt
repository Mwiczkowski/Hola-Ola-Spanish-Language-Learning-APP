package com.hola.loginverification

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return (email == "test@holaola.com" &&
                password == "test1234") ||
                (email == "admin@holaola.com" &&
                        password == "admin1234")
    }
}