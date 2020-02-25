class Wolf {
    var hunger =  10
    val food = "Meat"
    fun eat() {
        println("The wolf is eating $food")
    }
}
class MyWolf {
    var wolf: Wolf = Wolf()
    fun myFunction(){
        wolf?.eat()
    }
}
fun getAlphaWolf(): Wolf?{
    return Wolf()
}
fun main(args: Array<String>){
    var w: Wolf? = Wolf()
    if (w != null){
        w.eat()
    }
    var x = w?.hunger
    println("The value of X is $x")
    val y = w?.hunger ?: -1
    println("The value of Y is $y")
    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")
    val myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray){
        item?.let { println(it) }
    }
    getAlphaWolf()?.let { it.eat() }
    w = null
   try {
       var z = w!!.hunger
       println(z)
   }
   catch (e: NullPointerException){
       println("No value is entered")
   }
    finally {
        println("Enter a value to proceed")
    }
    println("Press next to proceed")
}
