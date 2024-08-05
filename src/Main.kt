data class Cats(val name: String, val age: Int)

fun main(){

    val cats = listOf(
        Cats("Tom", 5),
        Cats("Eugene", 7),
        Cats("Lizzy", 4),
        Cats("Kabu", 8),
        Cats("Karui", 6)

    )

    val oldestCat = cats.maxBy { it.age  }
    println("${oldestCat.name} is the oldest cat!")

    val greetings = { println("Hello Mate!") }
    greetings()

    val sum = {a: Int, b: Int -> a + b}
    val result = sum (5, 3)
    println("The sum is = $result")
}