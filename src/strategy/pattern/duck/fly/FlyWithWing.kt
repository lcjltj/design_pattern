package strategy.pattern.duck.fly

class FlyWithWing : FlyBehavior {
    override fun fly() {
        println("날수 있어요")
    }
}
