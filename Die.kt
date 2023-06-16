package game
import kotlin.random.Random

enum class Color {
    RED,
    WHITE,
    BLUE,

}

enum class Sides(val value: Int){
    Three(3),
    Four(4),
    Six(6),
    Twenty(20)

}

class Die(private val color: Color, private val numSides:Sides ){

}

fun main (){
    val die =Die(Color.RED, Sides.Four)
    print(Random.nextInt(1,10))
    }
