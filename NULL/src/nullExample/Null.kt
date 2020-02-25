package nullExample

fun main() {
    val input = readLine()
    if (input != null){
        println(input)
    }else{
        println("Your input was null!")
    }
}