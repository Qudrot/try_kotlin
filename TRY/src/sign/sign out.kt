package sign
// A function to display return value\\
fun main(args: Array<String>) {
    println("Enter your Home Address")
    Info(addr = readLine()!!.toInt(), name = readLine()!!.toString())
    val sum = sum(sum(readLine()!!.toInt(), 2), sum(3, readLine()!!.toInt()))
    println("The sum of a and b is: $sum")
}
fun sum (a: Int, b: Int) : Int{
    return a + b
}
fun Info (addr: Int, name: String): String{
    println("Address: $addr  Name: $name")
    var Contact : String = ("$addr $name")
    println("$Contact")
    return Contact
}