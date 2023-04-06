package data

fun main(){
    val grups = arrayOf<String>("Grub1", "Grup2", "Grup3", "Grup4")
    println(grups[0])
    println(grups.get(1))
    println("---------")

    grups[3] = "Grup tiga"
    grups.set(2, "Grup dua")

    println(grups[0])
    println(grups.get(2))
    println(grups.get(3))
}