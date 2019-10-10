import kotlin.random.Random

fun main(args : Array<String>)
{
    var obj = getRandomNumber()
}
//
fun getRandomNumber()
{
    println("Random number:" + Random.nextInt())
    println("Random number between the range 10 to 1000 : " + Random.nextInt((1000)))
}
