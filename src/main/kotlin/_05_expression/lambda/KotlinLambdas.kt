package com.bennyhuo.kotlin.expressions.lambdas

import kotlin.Function1

fun main() {
    val lambda: () -> Unit = fun() {
        println("Hello")
    }

    val lambda1: () -> Unit = {
        println("Hello")
    }

    /*
    无参lambda最简
     */
    val lambda2 = {
        println("Hello")
    }

// ----------------------------------------------
    val f0: Function1<Int, String> = {
        "Hello * $it"
    }

    val f1: (Int) -> String = {
        "Hello * $it"
    }

    /*
    有参lambda最简
     */
    val f2 = { p: Int ->
        "Hello * $p"
    }

    // output
    lambda2()
    println(f2(3))
    println(IntArray(5) { it }.contentToString())
}