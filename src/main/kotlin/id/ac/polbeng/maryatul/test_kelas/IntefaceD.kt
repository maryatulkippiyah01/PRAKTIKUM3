package id.ac.polbeng.maryatul.test_kelas

interface A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interface B")
    }
}
// Kelas ini mengimplementasikan antarmuka X dan Y
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}
fun main() {
    val obj = MyClassB()
    obj.demo()
}
