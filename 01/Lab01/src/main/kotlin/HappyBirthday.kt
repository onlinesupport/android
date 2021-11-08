class HappyBirthday {

    var name: String? = null
    var age: Int? = null

    val cakeWidth = 12
    val bannerWidth = 20

    constructor(name: String?, age: Int?){
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "HappyBirthday(name=$name, age=$age)"
    }

    fun giftCake() {
        printCandle()
        printBarForCake()
    }

    private fun printCandle() {
        println("   , , , , ,   ")
        println("   | | | | |   ")
    }

    fun sayHappyBirthday() {
        println("Happy birthday $name at $age years old")
    }

    fun printBar(width: Int){
        println("===============")
    }

    fun printBarForCake(){
        printBar(cakeWidth)
    }

    fun printBarForBanner(){
        printBar(bannerWidth)
    }
}