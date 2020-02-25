package sign

fun main(args: Array<String>) {
    printLessonName()
    printLessonSectionName("Function returning nothing")
}

fun printLessonName(){
    println("Functions Lesson")
}

fun printLessonSectionName(name:String){
    println("========$name========")
}
