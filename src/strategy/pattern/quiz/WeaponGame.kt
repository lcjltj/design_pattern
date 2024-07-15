import strategy.pattern.quiz.charactor.King
import strategy.pattern.quiz.weapon.ArrowWeapon

fun main(args: Array<String>) {
    val king = King()

    king.performAttack()
    king.changeWeapon(ArrowWeapon())
    king.performAttack()
}
