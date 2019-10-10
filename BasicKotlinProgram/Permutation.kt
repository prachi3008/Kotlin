fun main(args: Array<String>) {
    println("Enter the name : ")
    var name = readLine()
    permutation(name!!.toCharArray(), 0)
}

fun swap(name: CharArray, i: Int, j: Int) {
    var temp: Char = name[i]
    name[i] = name[j]
    name[j] = temp
}

fun permutation(name: CharArray, index: Int) {
    if (index == name.size - 1) {
        println(String(name))
    }
    for (i in index until name.size) {
        swap(name, index, i)
        permutation(name, index + 1)
        swap(name, index, i)
    }
}