package opt

fun main (args: Array<String>) {
    print("please enter your name:")
    val name = readLine()
    println("your name is $name")
    print("how old are you:")
    val age : Short = readLine()!!.toShort()
    println("your age is $age")
    print("Number to add to age")
    val number : Short = readLine()!!.toShort()
    println("your age in $number years will be ${age+number}")
}