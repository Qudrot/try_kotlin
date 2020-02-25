class Dog (val name: String, weight_Param : Int, breed_Param : String){
    init {
        println("Dog $name has been created")
    }
    var activities = arrayOf("Walks")
    val breed = breed_Param.toUpperCase()
    init {
        println("The breed is $breed")
    }
    var weight = weight_Param
    set(value){
        if (value > 0) field = value
    }
    val weightInKgs: Double
    get() = weight / 2.2

    fun bark(){
        println(if (weight > 50) "Yip!" else "Woof!")
    }
}
fun main (args: Array<String>) {
    val myDog = arrayOf(
        Dog("Frodo", 74, "Mixed"),
        Dog("Tam", 53, "Local"),
        Dog("Rex", 45, "Foreign")
    )
    myDog[1].bark()
    myDog[0].weight = 70
    println("Weight in Kgs is ${myDog[0].weightInKgs}")
    myDog[2].weight = -2
    println("Weight in Kgs is ${myDog[2].weightInKgs}")
    myDog[1].activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog[0].activities) {
        println("my Dog enjoys $item")
    }
    println("The weight for ${myDog[0].name} is ${myDog[0].weight}")
}
