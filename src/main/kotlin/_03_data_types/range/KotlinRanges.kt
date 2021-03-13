package _03_data_types.range

fun main() {
    /*离散值*/
    val intRange = 1..10 // [1, 10]
    val charRange = 'a'..'z'
    val longRange = 1L..100L

    /*连续值*/
    val floatRange = 1f .. 2f // [1, 2]
    val doubleRange = 1.0 .. 5.0


    println(intRange.joinToString())  //打印离散型整数区间的值: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    println(floatRange.toString())

    val uintRange = 1U..10U
    val ulongRange = 1UL..10UL

    val intRangeWithStep = 1..10 step 2
    val charRangeWithStep = 'a'..'z' step 2
    val longRangeWithStep = 1L..100L step 5

    println(intRangeWithStep.joinToString())

    val intRangeExclusive = 1 until 10 // [1, 10)
    val charRangeExclusive = 'a' until 'z'
    val longRangeExclusive = 1L until 100L

    println(intRangeExclusive.joinToString())

    val intRangeReverse = 10 downTo 1 // [10, 9, ... , 1]
    val charRangeReverse = 'z' downTo 'a'
    val longRangeReverse = 100L downTo 1L

    println(intRangeReverse.joinToString())

    for (element in intRange) {
        println(element)
    }

    intRange.forEach {
        println(it)
    }

    if (3.0 in doubleRange) {
        println("3.0 in range 'doubleRange'")
    }

    if (12 !in intRange) {
        println("12 not in range 'intRange'")
    }

    val array = intArrayOf(1, 3, 5, 7)
    for (i in 0 until array.size) {
        println(array[i])
    }

    for(i in array.indices){
        println(array[i])
    }
}