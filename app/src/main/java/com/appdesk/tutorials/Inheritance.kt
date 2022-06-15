package com.appdesk.tutorials

fun main(){
    val inheritance = Child()
    //inheritance.myMethod()
}

open class Inheritance{


    lateinit var hello:Inheritance


    val lazyUser : String by lazy {
        "Inheritance"
    }

    val name:String = ""
    open fun myMethod(){
        println("I am in Parent")

    }
    init {
        println("Parent Constructor is called")
    }
}

class Child : Inheritance(){

    init {
        println("Child Constructor is called")
    }

    val childName:String = ""
    override fun myMethod() {
        println("I am in child override")
    }

    fun myMethod2(){
        println("I am in Child")
    }
}