package id.ac.polbeng.maryatul.test_kelas

open class Teacher {
    // Harus menggunakan pengubah "terbuka" untuk mengizinkan kelas anak menimpanya
    open fun teach() {
        println("Mengajar...")
    }
    fun info(){
        println("Saya adalah seorang guru.")
    }
}
class MathsTeacher : Teacher() {
    // Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun teach() {
        println("Mengajar Matematika...")
    }
}
fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}
