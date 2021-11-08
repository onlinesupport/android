class ChristmasTree {
    var height: Int?=null

    constructor(height: Int?) {
        this.height = height
    }

    fun buildTree(){
        println("Build tree for $height floor")

    }

    override fun toString(): String {
        return "ChristmasTree(height=$height)"
    }
}