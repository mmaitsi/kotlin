fun main(args: Array<String>) {
    print("Enter your grade:")
    val num=Integer.valueOf(readlnOrNull())

    if (num>=80){
        println("Distinction")
    }
    else if (num>=60){
        println("Credit")
    }
    else if(num>=50){
        println("Pass")
    }
    else{
        println("Fail")
    }



}