package guessing

class GameBoard{

  var gameSize = 0
  var easy = false
  var mycode = ""
  var gos = 12

  def init():Unit= {
    gameSize = getGameSize()
    easy = getEasiness()
    mycode = newGame()
  }

  def getGameSize():Int = {
    val DEFAULTSIZE = 4
    val userInput = scala.io.StdIn.readLine("How many pegs would you like to guess? [default "+DEFAULTSIZE+"] ")

    if(userInput != null) {
      getGameSizeLogic(userInput, DEFAULTSIZE)
    }
    DEFAULTSIZE
  }

  def getGameSizeLogic(userInput:String, DEFAULTSIZE: Int):Int = {
    try {
      val numberPegs = userInput.toInt
      return numberPegs
    } catch {
      case e: NumberFormatException => println("Defaulted to 4")
    }
    DEFAULTSIZE
  }


  def getEasiness():Boolean={
    val userInput = scala.io.StdIn.readLine("Do you want to make this easy? ")
    getEasinessLogic(userInput)
  }

  def getEasinessLogic(userInput:String):Boolean={
    val upperUserInput = userInput.toUpperCase
    if((upperUserInput == "Y") || (upperUserInput == "YES")){
      true
    }
    else false
  }

  def newGame():String={
    GetCode.shapeFactory(gameSize)
  }

  def getGuess(): String={
    if(easy){println(mycode)}
    val userInput = scala.io.StdIn.readLine("What do you guess? ").toUpperCase

    userInput
  }

  def play(): Unit ={
    var gotit = false
    while(!gotit){

      gotit=takeTurn(getGuess(),mycode,gameSize)

      if(gos==0){
        println("Out of goes")
        gotit=true
      }
    }
  }

  def compareChar(char1: Char, char2: Char):Boolean={

    if (char1 == char2){
      true
    }else{
      false
    }
  }

  def takeTurn(turn: String, secret:String, size:Int): Boolean={
    var count = 0
    var letterNumber = 0
    gos -= 1
    for(letter <- turn) {
      //Show how system works if required
      //printDetails(letter, secret, easy, letterNumber)
      if (compareChar(letter, secret.charAt(letterNumber))) {count += 1}
      letterNumber += 1
    }
    println()
    printing(count, size)
    //If number right equals number of pegs return true (which stops game)
    if (count == size){true}else {false}
  }

  def printing(black:Int, gameSize:Int): Unit ={
    for (black <- 0 until black) {
      print("BLACK ")
    }
    for (white <- 0 until (gameSize - black)) {
      print("WHITE ")
    }
    println("\n---------------------\n")
    if (black == gameSize) {
      println("Well done!")
    }else{
      println("Goes left: "+gos)
    }
  }
  //The only use this method is to show how the system works
  /*def printDetails(letter: Char, myCode: String,
                   easy:Boolean, letterNumber: Int):Unit={
    if(easy){
      println("LETTER: " + letter)
      println("CHECKSTRING: " + mycode.charAt(letterNumber))
    }
  }*/
}

