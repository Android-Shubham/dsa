package kotlindsa

fun main() {
    println(mySqrt(8))
}

fun mySqrt(x: Int): Int {
    var start : Long = 0
    var end : Long = x.toLong()

    while(start+1<end){
        val mid : Long = start + (end - start) / 2
        if((mid * mid) == x.toLong()){
            return mid.toInt()
        }else if(mid * mid > x.toLong()){
            end = mid
        }else {
            start = mid
        }
    }

    if(end * end == x.toLong()){
        return end.toInt()
    }

    return start.toInt()
}