package strategy.pattern.quiz.weapon

class SwordWeapon : WeaponBehavior {
    override fun attack() {
        println("칼로 싹")
    }
}
