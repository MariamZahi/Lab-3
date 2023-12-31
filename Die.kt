package game

import kotlin.random.Random

enum class Color {
    RED,
    WHITE,
    BLUE,
}

enum class Sides(val value: Int) {
    Three(3),
    Four(4),
    Six(6),
    Twenty(20)
}

// Primary Constructor
class Die(private val color: Color, private val numSides: Sides) {
    // instead of over writing in the argument above
    var sideUp: Int = 1
        private set
    // Don't want user to mess up entries so we specify 1

    // intialize here and specify class
    init {
        roll()
    }

    // Secondary Constructor for calling primary
    constructor() : this(Color.WHITE, Sides.Six)
    constructor(numSides: Sides) : this(Color.WHITE, numSides)

    fun roll() {
        println("rolling the die")
        sideUp = Random.nextInt(1, numSides.value + 1)
    }

    override fun toString(): String {
        return "A ${color.name} die with ${numSides.value} faces and currently showing a $sideUp."
    }
}


