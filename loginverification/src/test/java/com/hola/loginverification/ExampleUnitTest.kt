package com.hola.loginverification

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val verification = LoginVerification()
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun loginSuccessful_whenCorrectCredentials() {
        assertTrue(verification.verifyEmailAndPassword("test@holaola.com", "test123"))
    }

    @Test
    fun loginFails_whenWrongEmail() {
        assertFalse(verification.verifyEmailAndPassword("test@test.com", "test123"))
    }

    @Test
    fun loginFails_whenWrongPassword() {
        assertTrue(verification.verifyEmailAndPassword("test@holaola.com", "test1234"))
    }

}
