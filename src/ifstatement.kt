fun main(args: Array<String>) {
    print("Enter number:")
    val num=Integer.valueOf(readlnOrNull())
    if (num %2==0){
        println("$num is evem number")
    }
    else{
        println("$num is odd number")
    }
    print("Enter age:")
    val age=Integer.valueOf(readlnOrNull())
    if (age>=18){
        println("Eligible to vote")
    }
    else{
        println("Not eligible to vote")
    }
}