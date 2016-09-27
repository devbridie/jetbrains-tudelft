import java.util.*

fun main(args: Array<String>) {
    // stdlib adds extensions to map:
    val map = HashMap<String, String>()

    // see java: map.put("key", "value")
    map["key"] = "value"

    val list = ArrayList<String>()
    list += "apples" // += on string
    list += listOf<String>("bananas", "pears") // += on List<String>

    val upReverse = "apples".map {
        char -> char.toUpperCase()
    }.asReversed().joinToString(separator = "")
    println(upReverse)
}

fun applyList(): ArrayList<String> {
    return ArrayList<String>().apply {
        add("test")
    }

    //java:
    //ArrayList<String> arr = new ArrayList<String>();
    //arr.add("abc");
    //return arr;
}