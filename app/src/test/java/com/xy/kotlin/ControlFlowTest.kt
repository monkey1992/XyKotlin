package com.xy.kotlin

import org.junit.Test

/**
 * The unit test for control flow
 */
class ControlFlowTest {

    /**
     * breakForeach
     *
     * break from forEach
     *
     * equal:
     * val iterable = IntRange(0, 20) as Iterable<*>
     * val iterator = iterable.iterator()

     * while (iterator.hasNext()) {
     *    val next = (iterator as IntIterator).nextInt()
     *    print(next)
     *    if (next <= 9) {
     *       println(next)
     *       continue
     *    }
     *    break
     * }
     */
    @Test
    @Throws(Exception::class)
    fun breakForEach() {
        run breaking@ {
            (0..20).forEach {
                print(it)
                if (it > 9) return@breaking
                println(it)
            }
        }
    }

    @Test
    @Throws(Exception::class)
    fun testWhile() {
        val iterable = IntRange(0, 20) as Iterable<*>
        val iterator = iterable.iterator()

        while (iterator.hasNext()) {
            val next = (iterator as IntIterator).nextInt()
            print(next)
            if (next <= 9) {
                println(next)
                continue
            }
            break
        }
    }

    /**
     * continueForEach
     *
     * continue in forEach
     */
    @Test
    @Throws(Exception::class)
    fun continueForEach() {
        (0..20).forEach continuing@ {
            print(it)
            if (it > 9) return@continuing
            println(it)
        }
    }
}