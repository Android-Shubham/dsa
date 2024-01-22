package leetcode

class Dummy(val radius : Int) {
    fun area() : Double{
        return Math.PI * radius * radius
    }
}

fun main() {
    fun Dummy.perimeter () : Double{
       return 2 * Math.PI * radius
    }

    val dummy = Dummy(10)
    println(dummy.area())
    println(dummy.perimeter())
}