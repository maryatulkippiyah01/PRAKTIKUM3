package id.ac.polbeng.maryatul.test_kelas
//Aturan Overriding
open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}
interface Polygon {
    fun draw() { // Anggota antarmuka 'terbuka' secara default
        println("From interface Polygon")
    }
}
class Square() : Rectangle(), Polygon {
    // Kompiler membutuhkan draw() untuk diganti:
    override fun draw() {
        super<Rectangle>.draw() // panggil ke Rectangle.draw()
        super<Polygon>.draw() // panggil ke Polygon.draw()
    }
}
fun main() {
    val square = Square()
    square.draw()
}
