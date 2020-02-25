package log

fun main(args: Array<String>) {
    var a: Int
    var b: Int
    print("enter a value ")
    a = readLine()!!.toInt()
    print("enter another value ")
    b = readLine()!!.toInt()
    var c: Int = 5
    //Arithmetic operation
    val sum = a + b
    val product = a * c
    val modulo = a % b
    println("a+b= $sum")
    println("what is a*c= $product")
    println("modulo ab= $modulo")
    // assignment operator
    a = b
    println("what is a? Ans is $a")
    a >= b
    println("what is a>=b? Ans is ${a >= b}")
    val d : Boolean = true
    val e : Boolean = !d
    println("you like school $d")
    println("you don't like books $e")
}