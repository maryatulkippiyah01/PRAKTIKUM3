package id.ac.polbeng.maryatul.test_kelas
//menggunakan data class
data class Student(val name: String, val age: Int)
fun main() {
    val maryatul = Student("Maryatul Kippiyah", 21)
    val ikmal = Student("Muhammad Ikmal", 20)
    println("Student Name is: ${maryatul.name}")
    println("Student Age is: ${maryatul.age}")
    println("Student Name is: ${ikmal.name}")
    println("Student Age is: ${ikmal.age}")
}