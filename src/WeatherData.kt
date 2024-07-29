import observer.Observer
import observer.Subject

class WeatherData : Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    var temperature = 0.0f
    var humidity = 0.0f
    var pressure = 0.0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    private fun measurementsChanged() {
        notifyObservers()
    }
}
