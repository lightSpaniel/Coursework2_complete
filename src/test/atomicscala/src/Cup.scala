/**
  * Created by jeremysmith on 30/01/2016.
  */
import com.atomicscala._

class Cup{
  var percentFull = 0
  val max = 100

  def add(increase:Int):Int={
    percentFull += increase
    if(percentFull > max){
      percentFull=max
    }
    percentFull
  }
}

val cup = new Cup
cup.add(45)
cup.add(-15)
cup.add(-50)



