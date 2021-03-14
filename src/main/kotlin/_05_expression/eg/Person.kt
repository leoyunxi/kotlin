package _05_expression.eg

class Person(val age: Int, val name: String){
    override fun equals(other: Any?): Boolean {
        val other = (other as? Person)?: return false
        return other.age == age && other.name == name
    }

    override fun hashCode(): Int {
        return 1 + 7 * age + 13 * name.hashCode()
    }
}

fun main() {
    val persons = HashSet<Person>()

//    (0..5).forEach {
//        persons += Person(20, "Benny")
//    }


    // -------------------------------------------------
    val person = Person(20, "Benny")
    persons += person

    // a moment later
    println(persons.size)

    val person2 = Person(person.age+1, person.name)

    /**
     * HashSet或HashMap中的对象在存储期间若Hashcode或equals发生变化，将无法删除，可能造成内存泄露
     */
    persons -= person

    println(persons.size)
}