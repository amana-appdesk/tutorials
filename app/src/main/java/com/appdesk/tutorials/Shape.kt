package com.appdesk.tutorials

sealed class Shape {

    class Circle(var radius:Float):Shape()
    class Square(var side: Int):Shape()
    class Rectangle(var lenght: Int, var breadth: Int):Shape()

}
fun main(){
    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(8)
    var rectangle = Shape.Rectangle(20,10)
    checkShape(circle)
}

fun checkShape(shape: Shape){
    when(shape){
        is Shape.Circle -> println("Circle area is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Square area is ${shape.side*shape.side}")
        is Shape.Rectangle -> println("Rectangle area is ${shape.breadth*shape.lenght}")

    }
}