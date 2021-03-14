package _05_expression.eg

operator fun String.minus(right: Any?) = this.replaceFirst(right.toString(), "")

operator fun String.times(right: Int): String {
    return (1..right).joinToString("") {
        // it : iterable中的元素T
        "$this "
    }
}

operator fun String.div(right: Any?): Int {
    val right = right.toString()
    return this.windowed(right.length, 1, transform = {
        it == right  //按部切割String → charSeq与参数比较，返回boolean
    }) // 返回比较结果集[false, false, false, false ... false, true, ..., true]
        .count {
            it  //  count结果集中true的个数
        }
}

fun main() {
    val value = "HelloWorld"

    println(value - "World")
    println(value * 2)

    val star = "*"
    println("*" * 20)

    println(value / 3)
    println(value / "l")
    println(value / "ld")
}
