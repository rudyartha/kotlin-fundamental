class Person(val firstName: String, val lastName: String, var age: Int)

fun main() {
    val person = Person("rudy", "artha", 25)
    println(person.firstName)
    println(person.lastName)
    println(person.age)
}

