val v1 = Vector(1,5,7,9,12)
val v2 = Vector("hello", "my", "name", "is", "jeremy")
val v3 = Vector(0.1,0.2,0,3,0,4,0.5)
val v4 = Vector(45l, 67l, 99l, 9999l)
val v5 = Vector(7.6f, 99f, 9.0f)

val v6 = Vector(v1,v2,v3,v4,v5)

val v7 = Vector("The","dog","visited","the","fire","station")
var sentence = ""
for(word <- v7){println(word); sentence+=word.concat(" ")}

sentence.toString()

val myIntVector = Vector(1,2,3,4,5)
val myDoubleVector = Vector(1.1,2.2,3.3,4.4,5.5)

val sum1 = myIntVector.sum
val sum2 = myDoubleVector.sum
val min1 = myIntVector.min
val min2 = myDoubleVector.min
val max1 = myIntVector.max
val max2 = myDoubleVector.max
