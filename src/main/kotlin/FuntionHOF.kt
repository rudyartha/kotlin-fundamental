fun main() {
    val fruits = mutableListOf("Grape", "Orange", "Strawberry", "Apple", "Smoothies")
    val pred: (x: String) -> Boolean = { x -> x.startsWith("s", true) }

    val newFruits = fruits.filter(pred)
    println(newFruits)
    val newFruitsSort = fruits.sortedBy { x: String -> x.length }
    println(newFruitsSort)
}



