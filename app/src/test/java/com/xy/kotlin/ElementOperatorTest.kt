package com.xy.kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ElementOperatorTest {

    private val list by lazy { listOf(1, 2, 3, 4, 5, 6) }

    /**
     * contains
     *
     * 如果指定元素可以在集合中找到，则返回true。
     */
    @Test
    @Throws(Exception::class)
    fun contains() {
        assertTrue(list.contains(2))
    }

    /**
     * elementAt
     *
     * 返回给定index对应的元素，如果index数组越界则会抛出IndexOutOfBoundsException。
     */
    @Test
    @Throws(Exception::class)
    fun elementAt() {
        assertEquals(2, list.elementAt(1))
    }

    /**
     * elementAtOrElse
     *
     * 返回给定index对应的元素，如果index数组越界则会根据给定函数返回默认值。
     */
    @Test
    @Throws(Exception::class)
    fun elementAtOrElse() {
        assertEquals(20, list.elementAtOrElse(10, { it * 2 }))
    }

    /**
     * elementAtOrNull
     *
     * 返回给定index对应的元素，如果index数组越界则会返回null。
     */
    @Test
    @Throws(Exception::class)
    fun elementAtONull() {
        assertNull(list.elementAtOrNull(10))
    }

    /**
     * first
     *
     * 返回符合给定函数条件的第一个元素。
     */
    @Test
    @Throws(Exception::class)
    fun first() {
        assertEquals(2, list.first { it % 2 == 0 })
    }

    /**
     * firstOrNull
     *
     * 返回符合给定函数条件的第一个元素，如果没有符合则返回null。
     */
    @Test
    @Throws(Exception::class)
    fun firstOrNull() {
        assertNull(list.firstOrNull { it % 7 == 0 })
    }

    /**
     * indexOf
     *
     * 返回指定元素的第一个index，如果不存在，则返回-1。
     */
    @Test
    @Throws(Exception::class)
    fun indexOf() {
        assertEquals(3, list.indexOf(4))
    }

    /**
     * indexOfFirst
     *
     * 返回第一个符合给定函数条件的元素的index，如果没有符合则返回-1。
     */
    @Test
    @Throws(Exception::class)
    fun indexOfFirst() {
        assertEquals(1, list.indexOfFirst { it % 2 == 0 })
    }

    /**
     * indexOfLast
     *
     * 返回最后一个符合给定函数条件的元素的index，如果没有符合则返回-1。
     */
    @Test
    @Throws(Exception::class)
    fun indexOfLast() {
        assertEquals(5, list.indexOfLast { it % 2 == 0 })
    }

    /**
     * lastOrNull
     *
     * 返回符合给定函数条件的最后一个元素，如果没有符合则返回null。
     */
    @Test
    @Throws(Exception::class)
    fun lastOrNull() {
        assertNull(list.lastOrNull { it % 7 == 0 })
    }

    /**
     * single
     *
     * 返回符合给定函数的单个元素，如果没有符合或者超过一个，则抛出异常。
     */
    @Test
    @Throws(Exception::class)
    fun single() {
        assertEquals(5, list.single { it % 5 == 0 })
    }

    /**
     * singleOrNull
     *
     * 返回符合给定函数的单个元素，如果没有符合或者超过一个，则返回null。
     */
    @Test
    @Throws(Exception::class)
    fun singleOrNull() {
        assertNull(list.singleOrNull { it % 7 == 0 })
        assertNull(list.singleOrNull { it % 2 == 0 })
    }
}