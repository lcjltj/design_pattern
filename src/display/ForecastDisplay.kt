package display

import WeatherData
import observer.Observer

class ForecastDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherData.pressure;
        display()
    }

    override fun display() {
        print("기상예보: ");
        if (currentPressure > lastPressure) {
            println("날씨가 좋아지고 있습니다!");
        } else if (currentPressure == lastPressure) {
            println("지금과 비숫할 것 같습니다 ");
        } else if (currentPressure < lastPressure) {
            println("쌀쌀하며 비가 올 것 같습니다 ");
        }
    }
}
