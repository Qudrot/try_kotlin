class Duck (){
    fun quack(){
        println("Quack! Quack! Quack!")
    }
}
fun main (args: Array<String>){
    val myDuck = Duck()
    println(myDuck.quack())
}