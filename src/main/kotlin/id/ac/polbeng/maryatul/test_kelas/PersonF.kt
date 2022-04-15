package id.ac.polbeng.maryatul.test_kelas

class PersonF (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }
    //Delegasi ke konstruktor lain di kelas yang
    //sama dilakukan menggunakan keyword this.
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    val maryatul = PersonF("Maryatul", "Kippiyah")
    val ikmal = PersonF("Muhammad ", "Ikmal", 21)
    val nia = PersonF("Nia", "Ardiati", "Indonesia")
    val surya = PersonF("Surya", "Kencana", 25, "Indonesia")
}
