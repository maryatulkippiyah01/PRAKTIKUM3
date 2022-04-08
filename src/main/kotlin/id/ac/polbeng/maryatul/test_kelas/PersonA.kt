package id.ac.polbeng.maryatul.test_kelas
//untuk membuat personA
class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val maryatul= PersonA("Maryatul", "Kippiyah", 21)
    println("Name : ${maryatul.firstName} ${maryatul.lastName}")
    println("Age : ${maryatul.age}")
}

