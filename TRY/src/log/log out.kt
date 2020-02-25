package log

fun main(args: Array<String>) {
    var X = 2
    var Y = 3
    var Z = 4
    //Arimethic operation
    var A = X + Y
    var B = Z * Y
    var C = X/Y
    var D = X%Y

    println("The value of A,B,C and D are $A,$B,$C and $D respectively")
    //Assignment operation
    X+=X
    Y-=Z
    Z/=X

    println("The value of X,Y and Z are $X , $Y , $Z")
    //Unary
    --X
    ++Y
    -Z
    println("The value of X,Y and Z are $X, $Y, $Z")
    var Fruit : Boolean = true
    var not = !Fruit
    println("Do you like fruit ($Fruit/$not)")
    //Comparison and equality
    println("X is greater than Y: ${X>Y}")
    println("X is less than Y: ${X<Y}")
    println("X is greater than or equal to Y: ${X>=Y || X<=Y}")
    println("X or Y is: ${Fruit||not && X<Y } ")


}