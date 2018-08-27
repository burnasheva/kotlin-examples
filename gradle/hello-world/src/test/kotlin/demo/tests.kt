package demo 

import kotlin.test.assertEquals
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestSource {
    @Test fun f() {
        assertEquals("Hello, world!", getGreeting())
    }

    @Test fun `first test should fail` () {
        assertTrue ( false, "Something went wrong!" )
    }

    @Test fun `second test should fail` () {
        assertFalse (true, "Something went wrong again!")
    }

    @Test fun `this test should pass` () {
        assertFalse (false, "Something went wrong again!")
    }
}
