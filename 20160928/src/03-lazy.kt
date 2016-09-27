val result by lazy {
    println("Long calculation, please wait...")
    Thread.sleep(3000)
    42
}

fun main(args: Array<String>) {
    println(result)

    println("Reusing the result...")
    println(result)
    println(result)
}

// implement your own lazy?