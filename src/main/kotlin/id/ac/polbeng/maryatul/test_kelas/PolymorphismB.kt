package id.ac.polbeng.maryatul.test_kelas

open class MyBase {
    // Harus menggunakan pengubah "terbuka" untuk mengizinkan kelas anak menimpanya
    open fun think () {
        println("Hey!! i am thinking ")
    }
}
class MyDerived: MyBase() { // pewarisan terjadi menggunakan konstruktor default
    // Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun think() {
        println("I Am from Child")
    }
}
fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}
