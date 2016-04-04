//import com.atomicscala.AtomicTest._
class Cup{
  private var percentFull = 0
  private val max = 100
  def add(increase:Int):Int={
    percentFull += increase
    if(percentFull > max){
      percentFull=max
    }else if(percentFull < 0){
      percentFull=0
    }
    percentFull
  }
  def getPercentFull(): Int ={
    percentFull
  }
  def setPercentFull(percentage:Int): Unit={
    this.percentFull=percentage
  }
}
val cup = new Cup
cup.add(45)
cup.add(-15)
cup.add(-50)
cup.add(10)
cup.add(-9)
cup.add(-2)
//cup.percentFull = 56 //error

cup.setPercentFull(56)
cup.getPercentFull()