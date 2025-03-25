fun main(args: Array<String>) {
    print("Enter the first number:")
    val fnum=Integer.valueOf(readlnOrNull())
    print("Enter the second number:")
    val snum=Integer.valueOf(readlnOrNull())
    print("Enter the third number:")
    val tnum=Integer.valueOf(readlnOrNull())

    if (fnum>snum && fnum>tnum){
        println("$fnum is greater than $snum and $tnum")
    }
    else if (snum>fnum && snum>tnum){
        println("$snum is greater than $fnum and $tnum")
    }
    else if (tnum>fnum && tnum>snum){
        println("$tnum is greater then $fnum and $snum")
    }
    else{
        println("All values are the same!")
    }







}