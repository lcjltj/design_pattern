package strategy.pattern.quiz.weapon

class ArrowWeapon : WeaponBehavior {
    override fun attack() {
        println("활로 통~")
    }
}
