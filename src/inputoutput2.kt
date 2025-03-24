fun main(args: Array<String>) {
    println("Enter the first number:")
    println("Enter the second number:")
    val num1=Integer.valueOf(readlnOrNull())
    val num2=Integer.valueOf(readlnOrNull())
    println("The sum of $num1 and $num2 is ${num1+num2}")
}