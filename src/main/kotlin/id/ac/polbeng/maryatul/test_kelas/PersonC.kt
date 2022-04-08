package id.ac.polbeng.maryatul.test_kelas
//untuk lebih ringkas lagi,deklarasi dan inisialisasi property dapat dilakukan didalam paramater constractor utama
class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val maryatul = PersonC("Maryatul", "Kippiyah", 21)
    println("Name : ${maryatul.firstName} ${maryatul.lastName}")
    println("Age : ${maryatul.age}")
}
