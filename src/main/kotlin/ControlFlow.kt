fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    for (ob in readOnlyShapes) {
        println(ob)
    }

    for (i in 1..10) {
        if (i % 2 == 0) println(i)
    }
}

