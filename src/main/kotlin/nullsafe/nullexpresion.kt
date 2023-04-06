package nullsafe

fun main(){
    var dateOut: String? = null
    var status = "Booked"

    status = "Checked"

    if (status.equals("Checked")){
        dateOut = "06/04/20223 13:52"
    }

    println(dateOut)
}