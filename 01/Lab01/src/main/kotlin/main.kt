

fun main(){
    // 1. Input
    println("Input name:")
    var name = readLine()

    println("Input birth year:")
    var year = readLine()!!.toInt()

    // 2. Draw cake
    var yearOld = 2021 - year // calculate age
    val happybirthday = HappyBirthday(name, yearOld) // init draw cake

    happybirthday.sayHappyBirthday()
    happybirthday.giftCake()

    // 3. Happy ...


    // 4. Draw bed


}