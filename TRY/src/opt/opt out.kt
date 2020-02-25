package opt

fun main(args: Array<String>) {
    print("Full name: " )
    val name : String = readLine()!!.toString()
    print("Age: " )
    val age : Int = readLine()!!.toInt()
    print("Sex: $" )
    val sex : String = readLine()!!.toString()
    print("Address: " )
    val address : String = readLine()!!.toString()
    println("your age is $age")
    print("Sorry age <16 is not qualify")

}
