package guessing

sealed trait peg{
  val colour: Char
  val position: Int
}

case class blue(position: Int) extends peg{
  val colour = 'B'
  val this.position = position}
case class green(position: Int) extends peg{
  val colour = 'G'
  val this.position = position}
case class orange(position: Int)  extends peg{
  val colour = 'O'
  val this.position = position}
case class purple(position: Int) extends peg{
  val colour = 'P'
  val this.position = position}
case class red(position: Int) extends peg{
  val colour = 'R'
  val this.position = position}
case class yellow(position: Int) extends peg{
  val colour = 'Y'
  val this.position = position}