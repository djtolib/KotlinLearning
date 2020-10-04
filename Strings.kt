fun main(args: Array<String>) {
    val str = "May the force be with you."
    val str1 = "May Dad said \"Hello\""
    val mlstr = """
        This 
        is 
        multiline
        string.
    """.trimIndent()
   // println(mlstr.trimIndent()) //trims indent
    val multi = """
            ?This
        ?is
                      ?multiline
        ?string.
    """.trimMargin("?") // trims by using prefix, default value is "|"
    //println(multi.trimIndent())
//    for (char in str) {
//        // Iterating by char collection
//        println(char)
//    }
    val st = "Привет"
    var subSequence = st.subSequence(1, 3)
    var substring = st.substring(1, 3)
    //subSequence[1] = 'a'
    //substring[1]='a'
    println("${subSequence.length} = hello")
    println(subSequence)

}