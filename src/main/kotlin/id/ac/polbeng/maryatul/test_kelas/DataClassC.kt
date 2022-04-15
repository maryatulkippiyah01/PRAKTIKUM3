package id.ac.polbeng.maryatul.test_kelas

fun main(){
    val maryatul = Student("Maryatul", 20)
    val ikmal = maryatul.copy("Ikmal")
    if(maryatul.equals(ikmal
        ))
        println("maryatul is equal to ikmal.")
    else
        println("maryatul is not equal to ikmal.")
    println("Hashcode of maryatul: ${maryatul.hashCode()}")
    println("Hashcode of ikmal: ${ikmal.hashCode()}")
}