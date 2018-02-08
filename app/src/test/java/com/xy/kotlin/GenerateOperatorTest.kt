package com.xy.kotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class GenerateOperatorTest {

    private val list by lazy { listOf(1, 2, 3, 4, 5, 6) }
    private val listRepeated by lazy { listOf(2, 2, 3, 4, 5, 5, 6) }

    /**
     * partition
     *
     * 把一个给定的集合分割成两个，
     * 第一个集合是由原集合每一项元素匹配给定函数条件返回true的元素组成，
     * 第二个集合是由原集合每一项元素匹配给定函数条件返回false的元素组成。
     */
    @Test
    @Throws(Exception::class)
    fun partition() {
        assertEquals(Pair(listOf(2, 4, 6), listOf(1, 3, 5)), list.partition { it % 2 == 0 })
    }

    /**
     * plus
     *
     * 返回一个包含原集合和给定集合中所有元素的集合，因为函数的名字原因，我们可以使用+操作符。
     */
    @Test
    @Throws(Exception::class)
    fun plus() {
        assertEquals(listOf(1, 2, 3, 4, 5, 6, 7, 8), list + listOf(7, 8))
    }

    /**
     * zip
     *
     * 返回由pair组成的List，每个pair由两个集合中相同index的元素组成。这个返回的List的大小由最小的那个集合决定。
     */
    @Test
    @Throws(Exception::class)
    fun zip() {
        assertEquals(listOf(Pair(1, 7), Pair(2, 8)), list.zip(listOf(7, 8)))
    }

    /**
     * unzip
     *
     * 从包含pair的List中生成包含List的Pair。
     */
    @Test
    @Throws(Exception::class)
    fun unzip() {
        assertEquals(Pair(listOf(5, 6), listOf(7, 8)), listOf(Pair(5, 7), Pair(6, 8)).unzip())
    }
}