package com.appdesk.tutorials

fun main(){

    val myLamda: (Int) -> Unit = {s:Int -> print(s)}
    val lambda = Lambda()

    val sum :(Int,Int)->Int = {a:Int,b:Int-> a+b }
    println(sum(5,5))

    val sum1 = {a:Int,b:Int-> print(a+b)}
    sum1(5,8)

    val s = "Hello"
    val s2 = "World"
    val s3 = "hey"
    print(s3.add(s,s2))

    lambda.addTwoNumber(2,3,myLamda)
}

class Lambda {

    fun addTwoNumber(a:Int, b:Int, action: (Int) -> Unit){
            val sum = a + b
        action(sum)
    }
}

fun String.add(s:String,s2:String):String{
    return this + s + s2
}


