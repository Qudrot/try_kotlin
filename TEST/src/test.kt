fun main (args: Array<String>){
    val options = arrayOf("Rock", "Paper", "Scissor")
    val gameChoice = getGameChoice(options)
    println(gameChoice)
    updateChoice(options)
    println(options)
    var num: Array<Int> = list(2,3,4)
    println(num)

}
fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[((optionsParam.size * Math.random()).toInt())]
fun list(a: Int, b: Int, c: Int): Array<Int>{
    return arrayOf(a, b , c)
}
fun updateChoice(optionsParam: Array<String>){
    optionsParam[1] = "freed"
}