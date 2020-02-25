package com.kudirat.projecct

fun main(args: Array<String>) {
    var myArr = arrayOf("ADA",50,"DEME",55,"DVEE",60,"CJAY",56,"DKAY",
        70,"ADEB",88,"AENE",50,"DEME",40,"FSKY",30,"FBEE",35,"FMOM",40,'F')
    println(myArr.size)
    val autolazyInt by lazy { 574 }
    println(lazy { 574 })
    for ( item in myArr) {
        println("$item")
    }
    // To check if an element is present in an array\\
   println("Third element is : ${myArr.get(3)}")
    println("Fourth element is : ${myArr[4]}")
    println("${myArr[6]} is an element of myArr:  ${myArr.contains("CJAY")}")
}

