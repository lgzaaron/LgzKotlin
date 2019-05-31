package com.lgz.lgzkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception


fun Int2String(valuea: Int): String {
    val y: String = valuea.toString()
    return y;
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        what();
//        Greeter("Kotlin").greet();
//        var obj="abcdef"
//        var obj2:Any= Any()
//        VariableVSValue().getLenght(obj2);
//        var content= VariableVSValue().max4(23,22);
//        println("VariableVSValue:  " + "------------------------------")
//       var content= VariableVSValue().RawString();
//        tv_name.setText(Int2String(content))
//        tv_name.setText(""+content)
//        VariableVSValue().declareVal();
//        var value: Int=2;
//        cases(value);

        tv_name.setText("MainActivity:--")
        returnDemo_1();
        breakDemo_2();
//        throwException("AAAAAAAAAAAAAAAAAAAA");
//        val outer = Outer()
        Outer().Inner().m()
        getArray()
    }
}

fun cases(obj: Any) {
    when (obj) {
        2 -> { // 注意这个块
            var value = 2 * 8
            println("MainActivity:--数字" + value)
        }
        1 -> println("MainActivity:--第一项")
        "hello" -> println("MainActivity:--这个是字符串hello")
        is Long -> println("MainActivity:--这是一个Long类型数据")
        !is String -> println("MainActivity:--这不是String类型的数据")
        else -> println("MainActivity:--else类似于Java中的default")
    }
}

fun test(value: Int) {
    val validNumbers = arrayOf("a", "c", 5, "adbv")
    for (index in validNumbers.indices) {
        println("sMainActivity:--这个是字符串   " + validNumbers[index])
    }
//    when (value) {
//        in 4..9 -> return ("x is in the range")
//        in validNumbers -> return("x is valid")
//        !in 10..20 -> return("x is outside the range")
//        else -> return("none of the above")
//    }
}

fun max(a: Int, b: Int) = if (a > b) a else b
fun returnDemo_1() {
    println("Demo_1  START " + ::returnDemo_1.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach here@{
        if (it == 4) return@here
        println("Demo_1  " + it)
    }
    println("Demo_1  END " + ::returnDemo_1.name)
}

fun breakDemo_2() {
    println("--------------- breakDemo_2 ---------------")
    outer@ for (outer in 1..5) {
        println("breakDemo_2 outer=" + outer)
          for (inner in 1..10) {
            println("breakDemo_2 inner=" + inner)
            if (inner % 2 == 0) {
                break@outer
            }
        }
    }
}

fun throwException(Value:String):Nothing{
    throw  Exception("YYYYYYYYYYYYYYYYY    "+Value);
}

fun getArray(){
    val list = mutableListOf(1, 2, 3)
    list.add(4)
    val lists= listOf<Int>(1,2,3)
    arrayOf(1,2,3)
    println("getArray:"+list)
    var listss= emptyList<String>();
   var  li=listss.toMutableList();
    li.add("2")
    li.add("3")
    println("getArray2:"+li)
    val StringList = mutableListOf<String>();
    println("getArray3:"+StringList)
    val StringArray =  arrayOf<String>()
    println("getArray4:"+StringArray)
    val StringArrays =  arrayOf<String>("0")
    StringArrays[0]="100";
    println("getArray5:"+StringArrays.toString())
//    val doubleList: ArrayList<Double> = arrayListOf(84.88, 100.25, 999.99)
}