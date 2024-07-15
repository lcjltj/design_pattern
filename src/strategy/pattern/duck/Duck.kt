package strategy.pattern.duck

import strategy.pattern.duck.fly.FlyBehavior
import strategy.pattern.duck.queak.QueakBehavior

abstract class Duck(private val fly: FlyBehavior, private val queak: QueakBehavior) {

    abstract fun display()

    fun performFly() {
        fly.fly()
    }

    fun performQueak() {
        queak.queak()
    }

    fun swim() {
        println("모든 오리는 수영 할 수 있어요.")
    }

}
