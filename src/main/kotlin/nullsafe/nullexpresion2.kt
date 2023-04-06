package nullsafe

fun main(){
    var dateOut: String? = null
    var status = "Booked"

    status = "Checkout"

    if (status.equals("Chechout")){
        dateOut = "06/04/2023 13:57"
    }

    println(status)
}