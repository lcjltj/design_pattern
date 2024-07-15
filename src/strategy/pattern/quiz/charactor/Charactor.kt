package strategy.pattern.quiz.charactor

import strategy.pattern.quiz.weapon.WeaponBehavior

abstract class Charactor(private var weaponBehavior: WeaponBehavior) {

    fun performAttack() {
        weaponBehavior.attack()
    }

    fun changeWeapon(weaponBehavior: WeaponBehavior) {
      this.weaponBehavior = weaponBehavior
    }
}
