package id.ac.polbeng.maryatul.test_kelas

interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}
interface Y {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}
// Kelas ini mengimplementasikan antarmuka X dan Y
class MyClassA: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hai")
    }
}
fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}