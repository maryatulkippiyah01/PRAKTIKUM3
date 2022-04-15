package id.ac.polbeng.maryatul.test_kelas
//Acces Modifier
open class Mahasiswa(var nama: String, var NIM: Int){
    open fun info() {
        println(nama +'\n'+ NIM);
    }
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nim= $NIM}"
    }
}
class KetuaHima(nama: String, nim: Int, val jurusan: String) : Mahasiswa(nama, nim) {
    @Override
    override fun info(){
        println(nama +'\n'+ NIM+'\n'+ jurusan);
    }
}
fun main(){
    val nia= Mahasiswa("Nia ardiati", 6304)
    val maryatul = KetuaHima("Maryatul", 6304, "Teknik Informatika")
    println(maryatul.toString());
    println()
    maryatul.info()
    println("Jenis Kelas = " + maryatul.javaClass.simpleName)
    println()
    nia.info()
    println("Jenis Kelas = " + nia.javaClass.simpleName)
    val ikmal = KetuaHima("Muhammad Ikmal", 5103, "Administrasi Niaga")
    println()
    ikmal.info()
    println("Jenis Kelas = " + ikmal.javaClass.simpleName)
}