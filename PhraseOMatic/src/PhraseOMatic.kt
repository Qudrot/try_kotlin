fun main (args: Array<String>){
    val wordArray1 = arrayOf("24/7", "Multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")
    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()
    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(phrase)
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pipping", "James")
    var x = 0
    while (x < 4){
        println("${hobbits[x]} is a nice hobbits name ")
        x += 1
    }
    val fireMan = arrayOf("Shakiru", "Sule", "Dejo", "Obioma", "Saka", "Afam")
    var firemanNo = 5
    while (firemanNo <= 5){
        println("Fireman number $firemanNo is ${fireMan[firemanNo]}")
        firemanNo -= 1
    }

    val fruit = arrayOf("Banana", "Blueberry", "Pomegranate", "Cherry")
    var fruits = 0
    while (fruits < 4){
        println("Fruit = ${fruit[fruits]}")
         fruits += 1

        val index = arrayOf(1, 3, 2, 4)
        val fruitList = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
            var x = 0
            var y: Int

        while (x < 4){
            y = index[x]
            println("Fruit = ${fruitList[y]}")
            x += 1

        }

    }
}