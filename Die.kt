package game

enum class Color {
    RED,
    WHITE,
    BLUE,

}

enum class Digits(val value: Int){
    Three(3),
    Four(4),
    Six(6),
    Twenty(20)

}

class Die(private val color: Color, private val numSides:Digits ){

}

fun main (){
    val die =Die(Color.RED, Digits.Four)
    println(Digits.Four.name.lowercase())
}
