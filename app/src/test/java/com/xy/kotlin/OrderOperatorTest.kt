package com.xy.kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Unit test for order operators.
 */
class OrderOperatorTest {

    private val unsortedList by lazy { listOf(3, 2, 7, 5) }

    /**
     * reversed
     *
     * 返回一个与指定list相反顺序的list。
     */
    @Test
    @Throws(Exception::class)
    fun reversed() {
        assertEquals(listOf(5, 7, 2, 3), unsortedList.reversed())
    }

    /**
     * sorted
     *
     * 返回一个自然排序后的list。
     */
    @Test
    @Throws(Exception::class)
    fun sorted() {
        assertEquals(listOf(2, 3, 5, 7), unsortedList.sorted())
    }

    /**
     * sortedBy
     *
     * 返回一个根据指定函数排序后的list。
     */
    @Test
    @Throws(Exception::class)
    fun sortedBy() {
        assertEquals(listOf(3, 7, 2, 5), unsortedList.sortedBy { it % 3 })
    }

    /**
     * sortedDescending
     *
     * 返回一个降序排序后的List。
     */
    @Test
    @Throws(Exception::class)
    fun sortedDescending() {
        assertEquals(listOf(7, 5, 3, 2), unsortedList.sortedDescending())
    }

    /**
     * sortedDescending
     *
     * 返回一个根据指定函数降序排序后的list。
     */
    @Test
    @Throws(Exception::class)
    fun sortedByDescending() {
        assertEquals(listOf(2, 5, 7, 3), unsortedList.sortedByDescending { it % 3 })
    }
}