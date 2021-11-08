
// immutable variable
val x = 1
val y = 3

val b:Char = '$'
val name:String = "Williema"

// mutable variable
var a = 1
var c: Float = 3.14F

fun main() {
    println("Hello to Kotlin")

    // calculate sum
    var z:Int = x+y
    println("z = $z")

    /**
     * call test
     */
    test()

}

fun test() {
    println("Testing here")

    var x = arrayOf(5, 7, 9)
    println(x[0])

    var y:IntArray = intArrayOf(10, 11, 12)
    y[2] = y[0] + y[1]
    println(y[2])

    println("Your name:")
    var z = readLine()
    println("Thank you, your name is $z")

    println("Your age:")
    var a = Integer.valueOf(readLine())
    println("Your day in earth is: ${10*a}")

    println("Your pocket:")
    var b = readLine()!!.toInt()
    println("Your salary is: ${a*b}")
}