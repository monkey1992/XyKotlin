package com.xy.kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Unit test for map operators.
 */
class MapOperatorTest {

    private val list by lazy { listOf(1, 2, 3, 4, 5, 6) }
    private val listWithNull by lazy { listOf(1, null, 3, null, 5, null) }

    /**
     * flapMap
     *
     * 遍历所有的元素，为每一个创建一个集合，最后把所有的集合放在一个集合中。
     */
    @Test
    @Throws(Exception::class)
    fun flapMap() {
        assertEquals(listOf(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7), list.flatMap { listOf(it, it + 1) })
        assertEquals(listOf(2, 4, 6, 8, 10, 12), list.flatMap { listOf(it * 2) })
    }

    /**
     * groupBy
     *
     * 返回一个根据给定函数分组后的map。
     */
    @Test
    @Throws(Exception::class)
    fun groupBy() {
        assertEquals(mapOf("odd" to listOf(1, 3, 5), "even" to listOf(2, 4, 6)),
                list.groupBy { if (it % 2 == 0) "even" else "odd" })
    }

    /**
     * map
     *
     * 返回一个每一个元素根据给定的函数转换所组成的List。
     */
    @Test
    @Throws(Exception::class)
    fun map() {
        assertEquals(listOf(2, 4, 6, 8, 10, 12), list.map { it * 2 })
    }

    /**
     * mapIndexed
     *
     * 返回一个每一个元素根据给定的包含元素index的函数转换所组成的List。
     */
    @Test
    @Throws(Exception::class)
    fun mapIndexed() {
        assertEquals(listOf(0, 2, 6, 12, 20, 30), list.mapIndexed { index, it -> index * it })
    }

    /**
     * mapNotNull
     *
     * 返回一个每一个非null元素根据给定的函数转换所组成的List。
     */
    @Test
    @Throws(Exception::class)
    fun mapNotNull() {
        assertEquals(listOf(2, 6, 10), listWithNull.mapNotNull { it?.let { it * 2 } })
    }
}