import java.util.*

class Node(data: Int, next: Node?) {
    var data: Int = data
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null

    fun printList() {
        var temp = head
        while (temp != null) {
            println("${temp.data}")
            temp = temp.next
        }
    }

    fun insertAtFirst(data: Int) {
        var newNode = Node(data, null)
        if (head == null) {
            head = newNode
        } else {
            newNode.next = head
            head = newNode
        }
    }

    fun insertAtLast(data: Int) {
        var newNode = Node(data, null)
        var temp = head
        if (head == null) {
            head = newNode
        } else {
            while (temp?.next != null) {
                temp = temp?.next
            }
        }
        temp?.next = newNode
        newNode.next = null
    }

    fun delete(key: Int) {
        var temp = head
        var prev: Node? = null
        if (head?.next == null) {
            print("List is empty")
        } else {
            while (temp?.next != null && temp.data != key) {
                prev = temp;
                temp = temp?.next;
            }
        }
        prev?.next = temp?.next
    }

    fun sortList() {
        var current = head
        var index: Node? = null
        var temp: Int
        if (head == null) {
            return
        } else {
            while (current != null) {
                index = current.next
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data
                        current.data = index.data
                        index.data = temp
                    }
                    index = index.next
                }
                current = current.next
            }
        }
    }
}

fun main(args: Array<String>) {
    var ch: String? = null
    var list = LinkedList()
    do {
        println("Select the operation which you want to do in Linked List")
        println("1-> Insert in the beginning")
        println("2-> Insert in the last")
        println("3-> Remove the element")
        println("4-> Sort the linked list")
        println("5-> Display Linked List")
        println("Enter your choice")
        var choice = readLine()!!.toInt()
        var value: Int = 0
        when (choice) {
            1 -> {
                println("Enter the element you want to insert in the beginning")
                value = readLine()!!.toInt()
                list.insertAtFirst(value)
                println("Inserted element.")
            }

            2 -> {
                println("Enter the element you want to enter in the last")
                value = readLine()!!.toInt()
                list.insertAtLast(value)
                println("Inserted element")
            }

            3 -> {
                println("Enter which element you want to remove.")
                value = readLine()!!.toInt()
                if (value <= 0) {
                    println("Enter a proper number.")
                }
                list.delete(value)
                println("Element is removed")
            }

            4 -> {
                list.sortList()
                println("Elements are sorted.")
            }

            5 -> {
                println("Elements of the linked list are : ")
                list.printList()
            }
            else -> println("You have entered wrong choice...Enter correct choice...")
        }
        println("Do you want to continue?")
        ch = readLine()
    } while (ch == "Y" || ch == "y")
}