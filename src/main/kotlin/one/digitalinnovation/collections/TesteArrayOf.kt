package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 5, 8, 1, 10, 7)

    values.forEach{
        println(it)
    }
    println("--------")
    values.sort()
    for (item in values){
        println(item)
    }
}