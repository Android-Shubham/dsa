package ownDs.queue

class QueueImpl<T> : Queue<T> {

    private val storage = arrayListOf<T>()

    override var isEmpty: Boolean
        get() = storage.isEmpty()
        set(value) {}

    override var count: Int
        get() = storage.size
        set(value) {}

    override fun enqueue(element: T): Boolean {
       return storage.add(element)
    }

    override fun dequeue(): T? {
        return if(isEmpty) null else storage.removeAt(0)
    }

    override fun peek(): T? {
        return storage.getOrNull(0)
    }
}