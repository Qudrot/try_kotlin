package time
import sign.Info
fun main(args: Array<String>) {
    Info(30, "pass")
    val grade = arrayOf(20,30,10,45,15)
    printgrade(grade)
    var mult = 1
    for (i in grade.indices){
        mult*=2
        grade[i]=mult
    }
    printgrade(grade)
    Info(1,"fail")
    val list = listOf(listOf("alex","bob"), listOf("bob", "jim"), listOf("debo", "mike"), listOf("bayo", "tim"), listOf("oke", "ode"))
    printlist(list)
    printNamelist(list)
    Info(2, "mutable lists")
    val mutablelist = mutableListOf<Int>()
    println("please enter 5 numbers:")
    for (o in 1..5) {
        mutablelist.add(readLine()!!.toInt())
    }
    printlist(mutablelist)
}
fun printlist(grade:List<Any>){
    for (item in grade){
        println(item)
    }
}
fun printNamelist(grade:List<List<String>>){
    for (item in grade){
        println("first:${item[0]}, second:${item[0]}")
    }
}



fun printgrade(grade:Array<Int>){
    for (item in grade){
        println(item)
    }
}


