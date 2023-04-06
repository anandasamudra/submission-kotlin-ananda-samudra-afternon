package ifexpresi

fun main(){
    val timeclose = 8
    val timenow = 8
    val timeopen = 6

    val kondisi =
        if (timenow >= timeclose){
            "Wamindo segera tutup"
        }else if(timenow >= timeopen){
            "Wamindo Buka"
        }else{
            "Wamindo tutup"
        }
    println(kondisi)
}