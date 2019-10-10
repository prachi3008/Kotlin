class Facade {
    fun trim(str: String): String {
        return str.trim { it <= ' ' }
    }

    fun changeCase(str: String): String {
        return str.toLowerCase()
    }

    fun doSomeAdditionalWork(str: String): String {
        return str.substring(0, str.length - 1) + str
    }

    fun specialStringOps(s: String): String {
        var s = s
        s = doSomeAdditionalWork(s)
        println("")
        s = changeCase(s)
        println("")
        s = trim(s)
        println("")
        s = doSomeAdditionalWork(s)
        println("")
        return s
    }
}
fun main(args: Array<String>) {
    var obj = Facade()
    print(obj.specialStringOps("PRACHI"))
}