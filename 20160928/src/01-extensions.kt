fun Int.isEven(): Boolean {
    return (this % 2 == 0)
}

val vowels = Regex("[AaEeIiOoUu]")

fun String.removeVowels() = this.replace(vowels, "")

fun MutableList<String>.removeAllStringsWithVowels(): MutableList<String> {
    this.removeAll {
        string -> string.contains(vowels)
    }
    return this
}

fun main(args: Array<String>) {
    println(1.isEven())
    println(2.isEven())

    println("abcdefg".removeVowels())

    println(mutableListOf("apples", "oranges", "bcd", "pqr", "pears").removeAllStringsWithVowels())
}