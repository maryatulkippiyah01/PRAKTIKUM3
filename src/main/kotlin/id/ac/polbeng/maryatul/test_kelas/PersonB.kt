package id.ac.polbeng.maryatul.test_kelas
//untuk meringkas kode program dapat menggabungkan proses deklarasi
class PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val maryatul = PersonB("Maryatul", "Kippiyah", 21)
    println("Name : ${maryatul.firstName} ${maryatul.lastName}")
    println("Age : ${maryatul.age}")
}
