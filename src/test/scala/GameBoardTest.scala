import guessing._
import org.scalatest.FunSuite

class GameBoardTest extends FunSuite {
  val gameBoard = new GameBoard

  test("gamesizelogic should return int value of string"){
    val input = "5"
    val default = 4
    val inputInt = input.toInt
    assert(gameBoard.getGameSizeLogic(input,default)==inputInt)
  }

  test("geteasinesslogic should return true with input y"){
    val input = "y"
    assert(gameBoard.getEasinessLogic(input))
  }

  test("geteasinesslogic should return false with input n"){
    val input = "n"
    assert(!gameBoard.getEasinessLogic(input))
  }

  test("compareChar will return true if characters are the same"){
    val input = 'a'
    assert(gameBoard.compareChar(input, input))
  }

  test("compareChar will return false if characters are not the same"){
    val input1 = 'a'
    val input2 = 'b'
    assert(!gameBoard.compareChar(input1, input2))
  }

  test("taketurn will return true if strings are equal"){
    val test = "test"
    val len = test.length
    assert(gameBoard.takeTurn(test,test,len))
  }
}

