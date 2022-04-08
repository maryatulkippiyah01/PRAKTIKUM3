package id.ac.polbeng.maryatul.test_kelas
//kelas tidak diinisialisasi pada saat mendeklarasikannya maka property tersebut harus di inisialisasi didalam konstruktor tambahan atau blok inisialisasi
class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val maryatul = PersonD("Maryatul", "Kippiyah", 21)
    println("Name : ${maryatul.firstName} ${maryatul.lastName}")
    println("Age : ${maryatul.age}")
}