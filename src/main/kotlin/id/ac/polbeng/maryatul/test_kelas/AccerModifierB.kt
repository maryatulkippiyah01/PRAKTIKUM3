package id.ac.polbeng.maryatul.test_kelas

abstract class Vehicle(val name: String,
                       val color: String,
                       val weight: Double) { //Sifat Beton (Non Abstrak)
    // Properti Abstrak (Harus diganti oleh Subclass)
    abstract var maxSpeed: Double
    // Metode Abstrak (Harus diimplementasikan oleh Subclass)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()
    // Metode Beton (Non Abstrak)
    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}
class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
        // Code to start a Car
        println("Car Started")
    }
    override fun stop() {
        // Code to stop a Car
        println("Car Stopped")
    }
    override fun sound() {
        // Code sound of a Car
        println("Brum...brum...brumm!")
    }
}
class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
        // Code to Start the Motorcycle
        println("Bike Started")
    }
    override fun stop() {
        // Code to Stop the Motorcycle
        println("Bike Stopped")
    }
    override fun sound() {
        // Code sound of a Car
        println("Preng...preng...preng!")
    }
}
fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)
    car.displayDetails()
    motorCycle.displayDetails()
    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}