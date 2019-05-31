package com.lgz.lgzkotlin

import now
import Car


fun what() {
    println("Hello,that is  what");
}

class Greeter(val name: String) {
    fun greet() {
        println("Hello,$name");
        now();
        Car().drive()
    }
}