package id.ac.polbeng.maryatul.test_kelas

// Child class (initializes the parent class)
class LaptopB : Computer{
    val batteryLife: Double
    //Memanggil super() untuk menginisialisasi kelas Induk
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }
    // Memanggil konstruktor lain (yang memanggil super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {
    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = LaptopB("Acer Aspire", "Acer")
    println(myLaptop.info())
}