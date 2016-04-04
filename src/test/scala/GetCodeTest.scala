import guessing._
import org.scalatest.FunSuite

class GetCodeTest extends FunSuite {

  test("shapefactory should return a string of length equal to parameter"){
    val parameter = 5
    val shape = GetCode.shapeFactory(parameter)

    assert(shape.length == parameter)

  }
}

