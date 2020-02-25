typealias DoubleConversion = (Double)-> Double
fun convert(x: Double, converter: DoubleConversion): Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DoubleConversion{
    if (str == "CentigradeToFahrenheit"){
        return {it * 1.8 + 32}
    } else if (str == "KgToPounds"){
        return {it * 2.204623}
    } else if (str == "PoundsToUsTons"){
        return {it / 2000.0}
    } else {
        return {it}
    }
}

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion{
    return {x: Double -> lambda2(lambda1(x))}
}

fun main (args: Array<String>){

    //Convert 2.5kg to pounds
    println("Convert 2.5kg to pounds: ${getConversionLambda("KgsToPounds")(2.5)}")

    //Define two conversion lambda
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUsTonsLambda = getConversionLambda("PoundsToUsTons")

    //Combine the two lambdas to create a new one
    val kgToUsTonsLambda = combine(kgsToPoundsLambda, poundsToUsTonsLambda)

    //Use the new lambda to convert 17.4to Us tons
    val value = 17.4
    println("$value kgs is ${convert(value, kgToUsTonsLambda)} Us tons")

}