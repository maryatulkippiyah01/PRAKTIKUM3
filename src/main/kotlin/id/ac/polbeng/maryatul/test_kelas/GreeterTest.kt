package id.ac.polbeng.maryatul.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Maryatul Kippiyah")
    greeter.greet("Muhammad Ikmal")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Agustina"))
}