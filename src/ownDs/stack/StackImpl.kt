package ownDs.stack

class StackImpl<T> : Stack<T> {
    private var storage = arrayListOf<T>()

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        return storage.removeLastOrNull()
    }

    override var count: Int
        get() = storage.size
        set(value) {}

    override fun peek(): T? {
        return storage.lastOrNull()
    }

}

fun String.isValidParenthesis() : Boolean{
    val stack = StackImpl<Char>()
    for(char in this){
        when(char){
            '(' -> stack.push(char)
            ')' ->{
                if(stack.isEmpty){
                    return false
                }else{
                    stack.pop()
                }
            }
        }
    }

    return stack.isEmpty
}