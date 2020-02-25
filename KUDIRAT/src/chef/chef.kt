package chef

fun main (args: Array<String>){
    println("Hello User, i am Chef Manny,")
    println("i will be assisting you with your cooking, ")
    println("Dont you worry your food is in safe hands. ")
    println("What country food would you like to cook today? ")
    val user = readLine()?.capitalize()
    var citizen = user + 'n'
    println("Interesting lets get started, here is a list of $citizen food")
    var asaro = Food()
}