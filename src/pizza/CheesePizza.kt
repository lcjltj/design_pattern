package pizza

class CheesePizza : Pizza {
    override fun prepare() {
        print("치즈 준비")
    }

    override fun bake() {
        print("빵 준비")
    }

    override fun cut() {
        print("컷팅")
    }

    override fun box() {
        print("포장")
    }
}
