package com.lgz.lgzkotlin

class VariableVSValue {
    fun declareVar() {
        var a = 1
        a = 2
        println("VariableVSValue:  " + a)
        println("VariableVSValue:  " + a::class)
        println("VariableVSValue:  " + a::class.java)

        var x = 5
        x += 1
        println("VariableVSValue:  " + "x=$x")
    }

    fun declareVal() {
        val b = "a"
        println("VariableVSValue:  " + b)
        println("VariableVSValue:  " + b::class)
        println("VariableVSValue:  " + b::class.java)

        val c: Int = 1
        val d = 2
        val e: Int
        e = 3
        println("VariableVSValue:  " + "c=$c,d=$d,e=$e")
    }

    fun getLenght(obj: Any): Int? {
        var result = 0
        if (obj is String) {
            println("VariableVSValue:  " + obj::class.java)
            result = obj.length
            println("VariableVSValue:  " + result)
        } else {
            println("VariableVSValue:  " + obj::class.java)
            println("VariableVSValue:  " + result)
        }

        return result
    }


    fun RawString():String? {

        val rawString = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
        println("VariableVSValue:=*#  " + rawString)
        println("VariableVSValue:=*#------------------------------  ")
        val fooTemplateString = "$rawString \n has ${rawString.length} characters"
        println(fooTemplateString)
        return  fooTemplateString;
    }


    fun max(a: Int, b: Int): Int {
// 作为表达式
        val max = if (a > b) a else b
        return max // return if (a > b) a else b
    }
    fun max1(a: Int, b: Int): Int {
// 传统用法
        var max1 = a
        if (a < b) max1 = b
        return max1
    }
    fun max2(a: Int, b: Int): Int {
// With else
        var max2: Int
        if (a > b) {
            max2 = a
        } else {
            max2 = b
        }
        return max2
    }

    fun max4(a: Int, b: Int): Int {
// 作为表达式
        val max =if (a > b) {
            a
        } else {
             b
        }
        return max // return if (a > b) a else b
    }
}