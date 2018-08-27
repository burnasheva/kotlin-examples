package hello.tests

import hello.getHelloString
import kotlin.test.assertEquals
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class HelloTest {
    @Test fun testAssert() : Unit {
        assertEquals("Hello, world!", getHelloString())
    }

    @Test fun `validate() function is recursively called on all children` () {
        assertTrue ( false, "Something went wrong!" )
    }

    @Test fun `validate() function throws an error when everything is bad` () {
        assertFalse (true, "Something went wrong again!")
    }

    @Test fun `validate() this test should pass` () {
        assertFalse (false, "Something went wrong again!")
    }
}
