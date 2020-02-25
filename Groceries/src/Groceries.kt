data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)

fun main(args: Array<String>){
    val groceries = listOf(Grocery("Tomatoes","Vegetable","1b",3.0,3),
        Grocery("Mushroom","Vegetable,","1b",4.0,1),
        Grocery("Bagels","Bakery","Pack",1.5,2),
        Grocery("Olive oil","Pantry","Bottle",6.0,1),
        Grocery("IceCream","Frozen","Pack",3.0,2))

    groceries.groupBy { it. category }. forEach{
        println(it.key)
        it.value.forEach{ println("   ${it.name}")}
    }

    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0){runningSum, item -> runningSum + item}
    println("sum of ints: $sumOfInts")

    val productOfInts = ints.fold(1){runningProduct, item -> runningProduct * item}
    println("products of ints: $productOfInts")

    val names = groceries.fold(""){string, item -> string + "${item.name}"}
    println("name: $names")

    val changeFrom50 = groceries.fold(50.0){change, item -> change - item.unitPrice * item.quantity}
    println("changeFRom50: $changeFrom50")
}