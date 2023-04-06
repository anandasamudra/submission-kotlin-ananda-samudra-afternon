package ifexpresi

fun main(){
    val waktu = 17
    val kondisi =
        if (waktu < 8 || waktu >= 20){
            "Warmindo tutup"
        }else{
            "Warmindo buka"
        }
    println(kondisi)
}