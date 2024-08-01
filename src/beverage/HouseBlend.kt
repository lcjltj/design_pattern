package beverage

class HouseBlend : Beverage {
    override fun getDescription() {
        print("하우스홀드")
    }

    override fun cost(): Double {
        return 0.89
    }
}
