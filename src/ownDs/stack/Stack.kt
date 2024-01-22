package ownDs.stack

interface Stack<T> {
    fun push(element: T)
    fun pop() : T?
    var count : Int
    fun peek() : T?

    val isEmpty : Boolean
        get() = count==0

}