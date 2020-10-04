fun main(args: Array<String>) {
    val sayHello  = { mess: String, quantity: Int ->
        var i = quantity
        while (i-- > 0) {
            println(mess);
            println(mess.toUpperCase())
        }
    }
    sayHello("Hello",3)
    sayHello("Good morning",3)
}