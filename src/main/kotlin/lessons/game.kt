package lessons

fun getGameChoice(options: Array<String>): String {
    val gameChoice = options.random()
    println("Computer choice is $gameChoice")
    return gameChoice
}

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        println("Please enter one of the following: Paper, Stone, Scissors")
        val userInput = readln()
        if (userInput != null && userInput in options) {
            isValidChoice = true
            userChoice = userInput
        } else println("You must enter a valid choice")
    }
    return userChoice
}

fun getResult(userChoice: String, gameChoice: String){
if ((userChoice == "Paper" && gameChoice == "Stone")||
   (userChoice == "Stone" && gameChoice == "Scissors")||
   (userChoice == "Scissors" && gameChoice == "Paper")){
    println("User win")
   } else {
       if (userChoice == gameChoice) println("tie")
    else println("Computer win")
   }

}