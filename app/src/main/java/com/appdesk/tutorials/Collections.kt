package com.appdesk.tutorials

fun main(){

    val array = Array()
    //array.arrayPrint()

    val list = List()
    list.listPrint()

}

class Array{
    private val numbers = intArrayOf(1,2,3,4,5)
    private val mixType = arrayOf(1,2,3,4,6.5,"test")

    //println(numbers.contentToString())
    //println(numbers2.contentToString())
    fun arrayPrint(){
        for (element in mixType)
        {
            println(element)
        }
    }
}

class List(){
    private val months = listOf("Jan","Feb","Mar")
    private val mixType = listOf("String",1,2,3,true,false)
    private val additionalMonths = months.toMutableList()
    private val newMonths = listOf("April","May","June")

    private val days = mutableListOf("Mon","Tue","Wed")

    fun listPrint(){
        days.add("Thu")
        days.add("Friday")
        val removeList = mutableListOf("Mon","Tue")
        days.removeAll(removeList)

        print(days)
        additionalMonths.addAll(newMonths)
        for (i in additionalMonths)
        {
            println(i)
        }
    }
}