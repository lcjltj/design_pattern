import store.NYPizzaStore

fun main() {
    val nyPizzaStore = NYPizzaStore()
    val pizza = nyPizzaStore.order("cheese")
}
