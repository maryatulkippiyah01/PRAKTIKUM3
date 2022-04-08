package id.ac.polbeng.maryatul.test_kelas
//Konstruktor tambahan bisa didefenisikan lebih dari satu.
class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 21
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    //Keyword this merujuk pada konstruktor kelas saat ini yang bersesuaian. Pada contoh
    //diatas this(_firstName, _lastName) merujuk pada konstruktor yang pertama dan akan
    //memanggilnya terlebih dahulu sebelum kode didalam konstruktor yang kedua
    //dieksekusi.
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val maryatul = PersonE("Maryatul ", "Kippiyah")
    maryatul.cetakInfo()
    println()
    val ikmal = PersonE("Muhammad ", "Ikmal", 25)
    ikmal.cetakInfo()
}