package condiment

import beverage.Beverage

class Mocha(override val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.20

    override fun getDescription() {
        beverage.getDescription()
        print(",모카")
    }

    override fun cost(): Double {
        return cost + beverage.cost()
    }
}
