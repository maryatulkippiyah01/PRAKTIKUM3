package id.ac.polbeng.maryatul.test_kelas

fun main() {
    val maryatul = Student("Maryatul Kippiyah", 20)
    // Destructuring Declaration with componentN() method
    val name = maryatul.component1()
    val age = maryatul.component2()
    println("Name = $name")
    println("Age = $age")
}