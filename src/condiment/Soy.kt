package condiment

import beverage.Beverage

class Soy(override val beverage: Beverage) : CondimentDecorator() {
    private val cost: Double = 0.15

    override fun getDescription() {
        beverage.getDescription()
        print(",두유")
    }

    override fun cost(): Double {
        return cost + beverage.cost()
    }

}
