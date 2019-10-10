fun main(args: Array<String>) {
    println("Enter the amount:")
    var amt = readLine()!!.toInt()
    countCurrency(Money(amt))
}

data class Money(var value: Int)

public fun countCurrency(totalMoney: Money) {
    val notes = intArrayOf(2000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
    val noteCounter = IntArray(10)
    for (i in 0..9)
        if (totalMoney.value >= notes[i]) {
            noteCounter[i] = totalMoney.value.div(notes[i])
            totalMoney.value -= noteCounter[i].times(notes[i])
        }
    println("Currency count -->")
    for (i in 0..9) {
        if (noteCounter[i] != 0) {
            println(notes[i].toString() + " : " + noteCounter[i])
        }
    }
}