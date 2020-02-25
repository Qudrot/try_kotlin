package SPP

data class Person(val name: String,
                  val age: Int? = null)

fun main() {
    val persons = listOf(Person("Alice"),
        Person("Bob", age = 29),Person("James",50))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
    // The oldest is: Person(name=Bob, age=29)?
    fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
        val numList = arrayOf(1, 2, 3)
        var x = 0
        while (x < 3){
            println("Item $x is ${numList [x]}")
            x +=1
        }

    }
}


