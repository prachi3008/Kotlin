package src

fun main(args: Array<String>) {
    var obj = CashCounterFunctions()
    var ch: String? = null
    do {
        println("Welcome to bank counter.....")
        println("**************************************************")
        println("Select the option from the following : ")
        println("1 -> Deposit the cash")
        println("2 -> Withdraw cash")
        println("3 -> Number of the people in the queue")
        println("**************************************************")
        var choice: Int = readLine()!!.toInt()

        when (choice) {
            1 -> {
                println("Enter the amount you have to deposit :  ")
                var data: Int = readLine()!!.toInt()
                obj.enqueue(data)
                obj.display()
            }
            2 -> {
                println("Enter the amount you want to withdraw : ")
                var amt: Int = readLine()!!.toInt()
                var remain = obj.dequeue()
                println("Remaining amount is : $remain")
                obj.display()
            }
            3 -> {
                var i = obj.size
                println("Number of people in the queue are : $i")
            }
            else -> println("Enter correct choice")
        }
        println("Do you want to continue?")
        ch = readLine()
    } while (ch == "Y" || ch == "y")
}