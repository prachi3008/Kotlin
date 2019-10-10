 fun main(args: Array<String>) {
    println("Enter no of elements you want to enter?")
    var n = readLine()!!.toInt()
    println("Enter $n elements")
    var arr = Array(n, { 0 })
    for (i in 0 until n)
        arr[i] = readLine()!!.toInt()
    mergeSort(arr, 0, arr.size - 1)
    println("Sorted array is : ")
    for (i in 0 until n)
        print("${arr[i]}   ")
}

fun mergeSort(arr: Array<Int>, first: Int, last: Int) {
    if (first < last) {
        var mid = (first + last) / 2
        //if (first == mid) return
        mergeSort(arr, first, mid)
        mergeSort(arr, mid + 1, last)
        merge(arr, first, mid, last)
    }
}

fun merge(arr: Array<Int>, first: Int, mid: Int, last: Int) {
    var left = arr.copyOfRange(first, mid + 1)
    var right = arr.copyOfRange(mid + 1, last + 1)
    var i = 0
    var j = 0
    for (k in first..last) {
        if ((i <= left.size - 1) && ((j >= right.size) || (left[i] <= right[j]))) {
            arr[k] = left[i]
            i++
        } else {
            arr[k] = right[j]
            j++
        }
    }
}