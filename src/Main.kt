import beverage.Beverage
import beverage.HouseBlend
import condiment.Mocha
import condiment.Soy
import condiment.Whip

fun main() {
    var houseBlend: Beverage = HouseBlend()
    houseBlend = Mocha(houseBlend)
    houseBlend = Mocha(houseBlend)
    houseBlend = Soy(houseBlend)
    houseBlend = Whip(houseBlend)

    houseBlend.getDescription()
    print(" " + houseBlend.cost())

}
