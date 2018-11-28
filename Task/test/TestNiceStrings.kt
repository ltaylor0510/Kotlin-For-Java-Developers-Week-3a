package nicestring

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestNiceStrings {

    private fun testNiceString(string: String, expected: Boolean) {
        assertEquals(expected, string.isNice(), "Wrong result for \"$string\".isNice()")
    }

    @Test
    fun testExample1() = testNiceString("bac", false)

    @Test
    fun testExample1a() = testNiceString("aei", true)

    @Test
    fun testExample1b() = testNiceString("baae", true)

    @Test
    fun testExample1c() = testNiceString("baei", false)

    @Test
    fun testExample2() = testNiceString("aza", false)

    @Test
    fun testExample3() = testNiceString("abaca", false)

    @Test
    fun testExample4() = testNiceString("baaa", true)

    @Test
    fun testExample5() = testNiceString("aaab", true)

    @Test
    fun testExample6() = testNiceString("baat", false)

    @Test
    fun testExample7() = testNiceString("beai", false)

    @Test
    fun testExample8() = testNiceString("buae", false)

    @Test
    fun testExample9() = testNiceString("buua", true)

    @Test
    fun testExample10() = testNiceString("beea", true)
}