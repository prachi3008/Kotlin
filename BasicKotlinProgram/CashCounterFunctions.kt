package src

class Node(data: Int, next: Node?) {
    var next: Node? = null
    var data: Int = 0
}

class CashCounterFunctions {
    var front: Node? = null
    var rear: Node? = null
    var size: Int = 0

    fun enqueue(amt: Int) {
        var newNode = Node(amt, null)
        newNode.data = amt
        if (rear == null) {
            front = newNode
            rear = newNode
        } else {
            rear!!.next = newNode
            rear = rear!!.next
        }
        size++
    }

    fun dequeue(): Int {
        if (front == null) {
            return 0
        }
        var temp = front
        front = front?.next
        size--
        if (front == null) {
            rear = null
        }
        return temp!!.data
    }

    fun display() {
        var sum: Int = 0
        println("Available balance : ")
        var temp = front
        if (temp == null) {
            println("empty")
            return
        }
        while (temp != rear!!.next) {
            sum += temp!!.data
            println(sum)
            temp = temp?.next
        }
        println()
    }

    fun peek(): Int {
        if (front == null) {
            println("Underflow exception")
        }
        return front!!.data
    }
}