package strategy.pattern.duck

import strategy.pattern.duck.fly.FlyWithWing
import strategy.pattern.duck.queak.Queak

class MallarDock : Duck(FlyWithWing(), Queak()) {

    override fun display() {
        println("나는 물오리 입니다.")
    }
}
