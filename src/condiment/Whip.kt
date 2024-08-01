package condiment

import beverage.Beverage

class Whip(override val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.10

    override fun getDescription() {
        beverage.getDescription()
        print(",휘핑")
    }

    override fun cost(): Double {
        return cost + beverage.cost()
    }
}
