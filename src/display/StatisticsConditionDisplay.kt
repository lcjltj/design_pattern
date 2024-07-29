package display

import WeatherData
import observer.Observer

class StatisticsConditionDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        tempSum += weatherData.temperature;
        numReadings++;

        if (weatherData.temperature > maxTemp) {
            maxTemp = weatherData.temperature;
        }

        if (weatherData.temperature < minTemp) {
            minTemp = weatherData.temperature;
        }

        display();
    }

    override fun display() {
        println(
            "평균/최고/최저 온도 = " + (tempSum / numReadings)
                    + "/" + maxTemp + "/" + minTemp
        );
    }
}
