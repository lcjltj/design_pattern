package beverage

class Espresso : Beverage {
    override fun getDescription() {
        print("에스프레소")
    }

    override fun cost(): Double {
        return 1.99
    }
}
