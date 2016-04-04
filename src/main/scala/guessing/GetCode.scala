package guessing

object GetCode{
  /*
  in order to increase the range of colours:
  1. change this value
  2. Add to the above list of case classes.
  3. Add to the match
   */
  val NUMBER_OF_COLOURS = 6

  def shapeFactory(numOfPegs:Int=4):String= {

    val secretCode = new StringBuilder

    val range = 1 to numOfPegs

    for (num <- range) {

      val rand = ((Math.random * NUMBER_OF_COLOURS )+1).toInt

      rand match {
        case 1 => secretCode += blue(num).colour
        case 2 => secretCode += green(num).colour
        case 3 => secretCode += orange(num).colour
        case 4 => secretCode += purple(num).colour
        case 5 => secretCode += red(num).colour
        case 6 => secretCode += yellow(num).colour
      }
    }
    secretCode.toString()
  }
}

