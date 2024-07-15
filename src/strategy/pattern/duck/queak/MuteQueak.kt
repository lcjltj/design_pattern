package strategy.pattern.duck.queak

class MuteQueak : QueakBehavior {
    override fun queak() {
        println("<Mute>")
    }
}
