package store

import pizza.*

class NYPizzaStore : PizzaStore() {
    override fun create(type: String): Pizza {
        if (type.equals("cheese")) {
            return CheesePizza()
        }

        if (type.equals("pepperoni")) {
            return PepperoniPizza()
        }

        if (type.equals("clam")) {
            return ClamPizza()
        }

        return VeggiePizza()
    }
}
