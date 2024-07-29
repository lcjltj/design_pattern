package display

import WeatherData
import observer.Observer

class CurrentConditionDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    var temperature: Float = 0f
    var humidity: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity

        display()
    }

    override fun display() {
        println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%")
    }
}
