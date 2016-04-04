import guessing._
import org.scalatest.FunSuite

class PegTest extends FunSuite {
   val b = new blue(1)
  test("A blue peg should have a colour of 'b'"){
    assert(b.colour=='B')
  }
}





