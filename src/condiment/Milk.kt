package condiment

import beverage.Beverage

class Milk(override val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.10

    override fun getDescription() {
        beverage.getDescription()
        print(",우유")
    }

    override fun cost(): Double {
        return cost + beverage.cost()
    }

}
