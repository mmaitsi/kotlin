open class Myparentclass{
    val father="He likes watching football"
    val mother="She likes going shopping"



}
class Myboychildclass:Myparentclass(){
    fun boy(){
        println(father)
    }



}
class Mygirlchildclass:Myparentclass(){
    fun girl(){
        println(mother)
    }



}

fun main(args: Array<String>) {
    val myobj=Myboychildclass()
    myobj.boy()
    val myobj2=Mygirlchildclass()
    myobj2.girl()
}