package com.appdesk.tutorials

fun main(){

    var car = Car()
    println("the car name ${car.brandName}")
    car.maxSpeed = 250
    println("Max Speed ${car.maxSpeed}")

}

class Car{
    val brandName: String = "BMW"
    get(){
        return field.lowercase()
    }

    var maxSpeed: Int = 200
    //get() = field   //getter
    set(value) {field = if (value > 0) value else throw IllegalAccessException("MaxSpeedShould Be a Positive") } //setter

}