package id.ac.polbeng.maryatul.test_kelas

fun main() {
    val maryatul = Student("Maryatul Kippiyah", 20)
    // Destructuring Declaration
    val(name, age) = maryatul
    println("Name = $name")
    println("Age = $age")
}