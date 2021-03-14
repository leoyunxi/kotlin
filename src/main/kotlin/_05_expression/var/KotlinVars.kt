package _05_expression.`var`

const val b = 3

class KotlinVars {
    companion object {
        const val b = 3
    }
}

object KotlinVars2 {
    const val b = 3
}

class X {
    /*
    只读变量：运行时确定
     */
    val b: Int
        get() {
            return (Math.random() * 100).toInt()
        }
}

fun main() {
    var a = 2
    a = 3

    /*
    只读变量：运行时确定
     */
    val c: Int

    if (a == 3) {
        c = 4
    } else {
        c = 5
    }

    /*
    常量引用，其property仍为变量or只读变量
     */
    val person = Person(18, "Bennyhuo")
    person.age = 19
}

class Person(var age: Int, var name: String)