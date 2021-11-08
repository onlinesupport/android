/**
 * Solution for lab-2
 */

fun main(){
    buildMenu()

}

fun buildMenu() {
    val optionNr = 3
    var optionOk = true

    println("Welcome to Tool Sets. Please choose:")
    println("1. Build Xmas Tree")
    println("2. Solve Math")
    println("3. Generate random password")

    do {
        try {
            val choose = readLine()!!.toInt()
            if (choose <= 0) || (choose > optionNr) {
                optionOk = false
            }
        } catch (e: Exception){
            optionOk = false
        }
    } while (optionOk == false)

}