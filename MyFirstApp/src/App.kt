fun main(args: Array<String>) {

    //Do something (Statement)
    var x = 1
    val name = "Mike"
    println("Before the loop. X = $x.")
    //Do something again and again (Loop)
    while (x < 4){
        println("In the loop. X = $x.")
        x += 1
        }
    println("After the loop. X = $x.")
    for (i in 1..10){
        x*=3
        println("the new value of X is $x")
    }
    x = 1
    while (x < 3){
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x += 1
    }
    if (x == 3) println("Do")
    //Do something under condition (Branching)
    var y = 14
    println(if (x > y) "x is greater than y" else "x is not greater than y")
    if (x == 20){
        println("X must be 20.")
    } else {
        println("X isn't 20.")
    }
    if (name == "Mike"){
        println("$name is Correct!")
    }else{
        println("incorrect name")
        data class Person(val name: String, val age: Int)

            val people = listOf(Person("Alice", 31), Person("Bob", 23))
            println(people.maxBy { it.age })
    }
}
fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder)
    { for (letter in 'A'..'Z')
    {
        this.append(letter)
    }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}
