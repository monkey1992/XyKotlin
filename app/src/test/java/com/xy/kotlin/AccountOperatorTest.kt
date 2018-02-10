package com.xy.kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Unit test for account operators.
 */
class AccountOperatorTest {

    private val list by lazy { listOf(1, 2, 3, 4, 5, 6) }

    /**
     * any
     *
     * 如果至少有一个元素符合给出的判断条件，则返回true。
     */
    @Test
    @Throws(Exception::class)
    fun any() {
        assertTrue(list.any { it % 2 == 0 })
        assertFalse(list.any { it > 10 })
    }

    /**
     * all
     *
     * 如果全部的元素符合给出的判断条件，则返回true。
     */
    @Test
    @Throws(Exception::class)
    fun all() {
        assertTrue(list.all { it < 10 })
        assertFalse(list.all { it % 2 == 0 })
    }

    /**
     * none
     *
     * 如果没有任何元素与给定的函数匹配，则返回true。
     */
    @Test
    @Throws(Exception::class)
    fun none() {
        assertTrue(list.none { it % 7 == 0 })
    }

    /**
     * count
     *
     * 返回符合给出判断条件的元素总数。
     */
    @Test
    @Throws(Exception::class)
    fun count() {
        assertEquals(3, list.count { it % 2 == 0 })
    }

    /**
     * fold
     *
     * 在一个初始值的基础上从第一项到最后一项通过一个函数累计所有的元素。
     * 如下:
     * 4 + (1 + 2 + 3 + 4 + 5 + 6) = 25
     * 9 * (1 * 2 * 3 * 4 * 5 * 6) = 64180
     */
    @Test
    @Throws(Exception::class)
    fun fold() {
        assertEquals(25, list.fold(4) { total, next -> total + next })
        assertEquals(6480, list.fold(9) { total, next -> total * next })
    }

    /**
     * foldRight
     *
     * 与fold一样，但是顺序是从最后一项到第一项。
     */
    @Test
    @Throws(Exception::class)
    fun foldRight() {
        assertEquals(25, list.foldRight(4) { total, next -> total + next })
        assertEquals(6480, list.foldRight(9) { total, next -> total * next })
    }

    /**
     * reduce
     *
     * 与fold一样，但是没有一个初始值。通过一个函数从第一项到最后一项进行累计。
     */
    @Test
    @Throws(Exception::class)
    fun reduce() {
        assertEquals(21, list.reduce { total, next -> total + next })
        assertEquals(720, list.reduce { total, next -> total * next })
    }

    /**
     * reduceRight
     *
     * 与reduce一样，但是顺序是从最后一项到第一项。
     */
    @Test
    @Throws(Exception::class)
    fun reduceRight() {
        assertEquals(21, list.reduceRight { total, next -> total + next })
        assertEquals(720, list.reduceRight { total, next -> total * next })
    }

    /**
     * forEach
     *
     * 遍历所有元素，并执行给定的操作。
     */
    @Test
    @Throws(Exception::class)
    fun forEach() {
        list.forEach { println(it) }
    }

    /**
     * forEachIndexed
     *
     * 与forEach相同，但是我们同时可以得到元素的index。
     */
    @Test
    @Throws(Exception::class)
    fun forEachIndexed() {
        list.forEachIndexed { index, value -> println("position $index contains a $value") }
    }

    /**
     * max
     *
     * 返回最大的一项，如果没有则返回null。
     */
    @Test
    @Throws(Exception::class)
    fun max() {
        assertEquals(6, list.max())
    }

    /**
     * maxBy
     *
     * 根据给定的函数返回最大的一项，如果没有则返回null。
     */
    @Test
    @Throws(Exception::class)
    fun maxBy() {
        assertEquals(1, list.maxBy { -it })
    }

    /**
     * max
     *
     * 返回最小的一项，如果没有则返回null。
     */
    @Test
    @Throws(Exception::class)
    fun min() {
        assertEquals(1, list.min())
    }

    /**
     * maxBy
     *
     * 根据给定的函数返回最小的一项，如果没有则返回null。
     */
    @Test
    @Throws(Exception::class)
    fun minBy() {
        assertEquals(6, list.minBy { -it })
    }

    /**
     * sumBy
     *
     * 返回所有每一项通过函数转换之后的数据的总和。
     */
    @Test
    @Throws(Exception::class)
    fun sumBy() {
        assertEquals(3, list.sumBy { it % 2 })
    }
}