package guessing

object Main  {
  //interface
  def main(args: Array[String]): Unit ={
    val getNewGame = new GameBoard
    getNewGame.init()
    getNewGame.play()
  }
}

