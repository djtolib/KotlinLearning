open class Player(val name:String = "Hello", val age:Int = 0){
    open fun  attack() {
        println("$name is attacking!")
    }
    fun walk() {
        println("$name is walking")
    }
}
class Thief(val t_name: String = "Thief", val t_age: Int = 1) : Player(t_name, t_age) {
    override fun attack(){
        super.attack()
        println("Thief by name $t_name is attacking")

    }



}
fun main(args: Array<String>) {
    val pl = Thief()
    pl.attack()
    println(pl.t_age)

}