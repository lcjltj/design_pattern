package display

import WeatherData
import observer.Observer

class HitIndexDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    private var hitIndex: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.hitIndex = computeHeatIndex(weatherData.temperature, weatherData.humidity)
        display()
    }

    private fun computeHeatIndex(temperature: Float, humidity: Float): Float {
        val index =
            (((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity) + (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity))
                    + (0.000345372 * (temperature * temperature * humidity))) - (0.000814971 * (temperature * humidity * humidity)) +
                    (0.0000102102 * (temperature * temperature * humidity * humidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
                    (humidity * humidity * humidity)) + (0.00000142721 * (temperature * temperature * temperature * humidity)) +
                    (0.000000197483 * (temperature * humidity * humidity * humidity)) - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
                    0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
                    (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity))).toFloat()
        return index
    }

    override fun display() {
        println("체감온도: " + hitIndex)
    }
}
