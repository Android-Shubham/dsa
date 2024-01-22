package ownDs.queue

interface Queue<T> {
    var count : Int
    var isEmpty : Boolean
    fun enqueue(element: T) : Boolean
    fun dequeue() : T?
    fun peek() : T?
}