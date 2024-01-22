package idhrudhar

fun main() {
    val fn :  (a : Double, b : Double) -> Double = ::pow
    println(fn(1.0,1.0))
    higherOrderfun(1.0,2.0,::pow)
}

fun pow(a : Double,b : Double) : Double{
    return a*b
}

fun higherOrderfun (a : Double, b : Double, gn:(Double,Double) -> Double) : Double{
    return gn(a,b)
}