package com.xy.kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class FilterOperatorTest {

    private val list by lazy { listOf(1, 2, 3, 4, 5, 6) }
    private val listWithNull by lazy { listOf(1, null, 3, null, 5, null) }

    /**
     * drop
     *
     * 返回包含去掉前n个元素的所有元素的列表。
     */
    @Test
    @Throws(Exception::class)
    fun drop() {
        assertEquals(listOf(5, 6), list.drop(4))
    }

    /**
     * dropWhile
     *
     * 返回根据给定函数从最后一项开始去掉指定元素的列表。
     */
    @Test
    @Throws(Exception::class)
    fun dropWhile() {
        assertEquals(listOf(3, 4, 5, 6), list.dropWhile { it < 3 })
    }

    /**
     * dropLastWhile
     *
     * 返回根据给定函数从最后一项开始去掉指定元素的列表。
     */
    @Test
    @Throws(Exception::class)
    fun dropLastWhile() {
        assertEquals(listOf(1, 2, 3, 4), list.dropLastWhile { it > 4 })
    }

    /**
     * filter
     *
     * 过滤所有符合给定函数条件的元素。
     */
    @Test
    @Throws(Exception::class)
    fun filter() {
        assertEquals(listOf(2, 4, 6), list.filter { it % 2 == 0 })
    }

    /**
     * filterNot
     *
     * 过滤所有不符合给定函数条件的元素。
     */
    @Test
    @Throws(Exception::class)
    fun filterNot() {
        assertEquals(listOf(1, 3, 5), list.filterNot { it % 2 == 0 })
    }

    /**
     * filterNotNull
     *
     * 过滤所有元素中不是null的元素。
     */
    @Test
    @Throws(Exception::class)
    fun filterNotNull() {
        assertEquals(listOf(1, 3, 5), listWithNull.filterNotNull())
    }

    /**
     * slice
     *
     * 过滤一个list中指定index的元素。
     */
    @Test
    @Throws(Exception::class)
    fun slice() {
        assertEquals(listOf(2, 4, 5), list.slice(listOf(1, 3, 4)))
    }

    /**
     * take
     *
     * 返回从第一个开始的n个元素。
     */
    @Test
    @Throws(Exception::class)
    fun take() {
        assertEquals(listOf(1, 2), list.take(2))
    }

    /**
     * takeLast
     *
     * 返回从最后一个开始的n个元素
     */
    @Test
    @Throws(Exception::class)
    fun takeLast() {
        assertEquals(listOf(5, 6), list.takeLast(2))
    }

    /**
     * takeWhile
     *
     * 返回从第一个开始符合给定函数条件的元素。遇到不满足的元素，直接终止循环，并返回子集合。
     */
    @Test
    @Throws(Exception::class)
    fun takeWhile() {
        assertEquals(listOf(1, 2), list.takeWhile { it < 3 })
    }

    /**
     * takeLastWhile
     *
     * 返回从最后一个开始符合给定函数条件的元素。遇到不满足的元素，直接终止循环，并返回子集合。
     */
    @Test
    @Throws(Exception::class)
    fun takeLastWhile() {
        assertEquals(listOf<Int>(), list.takeLastWhile { it < 3 })
        assertEquals(listOf<Int>(), list.takeLastWhile { it % 2 == 1 })
        assertEquals(list, list.takeLastWhile { it < 7 })
        assertEquals(listOf(6), list.takeLastWhile { it % 2 == 0 })
        assertEquals(listOf(5, 6), list.takeLastWhile { it > 4 })
    }
}