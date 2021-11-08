open class Computer {
    open var x: Int = 5
    var y: Int = 11
}

class Tablet : Computer() {
    override var x: Int = 20
}