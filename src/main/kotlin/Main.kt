import java.lang.*
import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

suspend fun main() {

    //   val names = mutableListOf("Alex", "Max", "Ilona")
//    println(names)
//    names.swap(0, 2)
//    println(names)
//    val options = arrayOf("Stone", "Paper", "Scissors")
//    val userChoice = getUserChoice(options)
//    val gameChoice = getGameChoice(options)
    //  getResult(userChoice, gameChoice)


}
enum class Persons{alex, ilona, dawid, max}

data class Products(val id: Int, val name: String, val count: Short, val price: Double)


fun myFun(str: String) {
    try {
        val x = str.toInt()
        println(x)
    } catch (e: NumberFormatException) {
        println("Error was catching")
    }
    println("myFun is ended")
}

data class Player(val id: Int, var name: String, var number: Short, var skill: Short)

fun check(x: Any) {
    when (x) {
        is Int -> println("It is Integer")
        is Long -> println("It is Long")
        is String -> println("It is String")
        is Boolean -> println("It is Boolean")
        else -> println("I don't know what is it")
    }
}

data class MyPerson(var firstName: String, var lastName: String, var age: Int) {
    val mounth: Int
        get() = age * 12


}

class Person {

    private lateinit var lateinitPerson: String
    fun check() {
        println("Is myVariable initialized?  ${this::lateinitPerson.isInitialized} ")
        lateinitPerson = "alex"
        println("Is myVariable initialized? ${this::lateinitPerson.isInitialized}")
    }
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val x = this[index1]
    this[index1] = this[index2]
    this[index2] = x
}