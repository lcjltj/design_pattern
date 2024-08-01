package beverage

class Decaf : Beverage {
    override fun getDescription() {
        print("디카페인")
    }

    override fun cost(): Double {
        return 1.05
    }
}
