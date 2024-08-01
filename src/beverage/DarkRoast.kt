package beverage

class DarkRoast : Beverage {
    override fun getDescription() {
        print("다크로스트")
    }

    override fun cost(): Double {
        return 0.99
    }
}
