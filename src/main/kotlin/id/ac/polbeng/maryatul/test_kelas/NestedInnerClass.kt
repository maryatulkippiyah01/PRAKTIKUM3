package id.ac.polbeng.maryatul.test_kelas

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}
fun main(args: Array<String>) {
    // mengakses anggota kelas Bersarang
    println(Outer.Nested().b)
    // membuat objek kelas Bersarang
    val nested = Outer.Nested()
    println(nested.callMe())
}