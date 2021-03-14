package _04_class_interface.nullable

fun main() {
    /**
     * 默认不可赋值为null
     */
    var nonNull: String = "Hello"
//     nonNull = null
    val length1 = nonNull.length


    /**
     * ?=可赋值为null
     * ?.跳过null检查,若为null则返回null
     * ?:若为null则赋值为
     */
    var nullable: String? = null
    var length = nullable?.length  //null
    length = nullable?.length ?: -1 //elvis --  null? nullable.length : -1
    println(length)


    /**
     * any?（范围大） 是 any（范围小）的超类superclass
     */
    var x: String = "Hello"
    var y: String? = "World"
//    x = y // Type mismatch
    y = x // OK

    var a: Int = 2
    var b: Number = 10.0
//    a = b // Type mismatch
    b = a // OK

    /**
     * any!:跨平台类型，需自行约束并判null
     */
//    val person = Person()
//    val title = person.title
//    val titleLength = title?.length

//    val file = File("abc")
//    val files = file.listFiles()
//    println(files.size)
}

