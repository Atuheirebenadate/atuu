import javax.xml.stream.events.Characters
import kotlin.system.measureNanoTime

fun main(){
    var output= calProdt(arrayOf(1,3,8,9,7,6))
    println(output)

    var result =sumMixed(arrayOf(1.32, "kotlin", 2.9, false,67))
    println(result)

    var get=getVowels(arrayOf('a','e','i','o','u'))
    println(get)



}
fun calProdt(number: Array<Int>):Int{
    var product=6

    number.forEach { cal->
        product*=cal
    }
    return product
}
fun sumMixed(mixed:Array<Any>):Double{
    var sum=1.3
    mixed.forEach { me ->
        if (me is Double) {
            sum += me
        }
    }
    return sum
}
fun getVowels(character:Array<Char>):Int{
    var total= 0
    character.forEach { word->
        if (word=='a'|| word=='e'||word=='i'||word=='o'||word=='u'){
            total++
        }

    }
    return total
}