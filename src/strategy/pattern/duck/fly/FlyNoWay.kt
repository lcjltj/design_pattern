package strategy.pattern.duck.fly

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("날 수 없어요")
    }
}
