package lessons
interface Roamable{
    fun roam()
}

abstract class Animal(): Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoize()
    abstract fun eat()

    fun sleep() {
        println("The animal is sleeping")
    }

    override fun roam() {
        println("The animal is roaming")
    }
}

class Hippo : Animal() {
    override val image = "image.hippo"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoize() {
        println("FRrrrrrrrrrrr!!")

    }

    override fun eat() {
        println("The hippo is eating $food")

    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("The canine is roaming")
    }
}


class Wolf : Canine() {
    override val image = "image.wolf"
    override val food = "meet"
    override val habitat = "forest"

    override fun makeNoize() {
        println("AAAUUUUUuuuu!!")

    }

    override fun eat() {
        println("The wolf is eating $food")

    }
}
class Vehicle: Roamable{
    override fun roam() {
        println("the vehicle is roaming")
    }
}
class Vet  {
    fun shot(a: Animal) {
        a.makeNoize()
    }
}
