package condiment

import beverage.Beverage

abstract class CondimentDecorator() : Beverage {
    abstract val beverage: Beverage
    abstract override fun getDescription()
}
