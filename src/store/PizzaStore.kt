package store

import pizza.Pizza

abstract class PizzaStore {
    fun order(type: String): Pizza {
        val pizza = create(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza;
    }

    protected abstract fun create(type: String): Pizza
}
