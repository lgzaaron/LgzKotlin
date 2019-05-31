package com.lgz.lgzkotlin

class Outer {
    val oh = "Oh!"
    inner class Inner {
        fun m() {
            val outer = this@Outer
            val inner = this@Inner
            val pthis = this
            println("kotlin-outer=" + outer)
            println("kotlin-inner=" + inner)
            println("kotlin-pthis=" + pthis)
            println("kotlin-"+this@Outer.oh)
            val fun1 = hello@ fun String.() {
                val d1 = this // fun1 的接收者
                println("kotlin-d1" + d1)
            }
            val fun2 = { s: String ->
                val d2 = this
                println("kotlin-d2=" + d2)
            }
            "abc".fun1()
            fun2
        }
    }
}