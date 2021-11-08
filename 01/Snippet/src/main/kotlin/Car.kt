import kotlin.math.max

class Car {
    var type :String?=null
    var maxspeed : Int?=null
    var number_of_seats:Int?=null

    constructor()

    constructor(type: String, maxspeed: Int, seat: Int) {
        this.type = type;
        this.maxspeed = maxspeed
        this.number_of_seats = seat
    }

    override fun toString(): String {
        return "Car(type=$type, maxspeed=$maxspeed, number_of_seats=$number_of_seats)"
    }



}