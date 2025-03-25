class Myclass{
//    data member
    var name="My name is John"
//    memeber function
    fun display() {
    println(name)
    }
    fun main(args: Array<String>){
        val obj=Myclass()
        obj.display()

//        creating object for car class
        val myobj2=Car()
        myobj2.model="Toyota"
        myobj2.make="Landcruiser"
        myobj2.yom=2018
        println("My favourite car model is ${myobj2.model} being a ${myobj2.make} manufactured ${myobj2.yom}")



    }
    class Car{
        var model=""
        var make=""
        var yom=0
    }

    


}