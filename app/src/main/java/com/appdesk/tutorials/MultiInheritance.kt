package com.appdesk.tutorials

interface Swimable {
    fun swim()
}

class SwimableImpl : Swimable {
    override fun swim() {
        println("swim!")
    }
}
interface Jumpable {
    fun jump()
}
class JumpableImpl : Jumpable {
    override fun jump() {
        println("jump!")
    }
}
class Frog(
    swimable: Swimable = SwimableImpl(),
    jumpable: Jumpable = JumpableImpl()
) : Swimable by swimable, Jumpable by jumpable
fun main() {
    val frog = Frog()
    frog.jump()
    frog.swim()

}