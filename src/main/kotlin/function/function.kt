package function

fun setUser(nama: String, umur: Int): String{
    return "Nama kamu $nama dan umur kamu adalah $umur tahun"
}
fun main(){
    val run = setUser("Cahyo", 22)
    println(run)
}