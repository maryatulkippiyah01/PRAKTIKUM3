package id.ac.polbeng.maryatul.test_kelas

interface Named {
    val name: String
}
interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}
data class EmployeeB(
// menerapkan 'nama' tidak diperlukan
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person
fun main(){
    val pegawai = EmployeeB("Maryatul ", "Kippiyah", "Programmer")
    println(pegawai.name)
}