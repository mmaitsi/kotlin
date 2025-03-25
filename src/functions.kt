fun myfunction(){
    println("This is my first function")
}
fun main(args: Array<String>) {
    myfunction()
    addtwonum()
}
fun addtwonum(){
    println("Enter first number:")
    val num=Integer.valueOf(readlnOrNull())
    println("Enter second number:")
    val num2=Integer.valueOf(readlnOrNull())
    println("The sum of $num and $num2 is ${num+num2}")
}
fun studentreg(fname:String,lname:String,age:Int){
    println("Student's first name is $fname last name $lname and age $age")

}