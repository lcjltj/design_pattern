import display.CurrentConditionDisplay
import display.ForecastDisplay
import display.HitIndexDisplay
import display.StatisticsConditionDisplay

fun main() {
    val weatherData = WeatherData()
    val currentConditionDisplay = CurrentConditionDisplay(weatherData)
    val StatisticsConditionDisplay = StatisticsConditionDisplay(weatherData)
    val ForecastDisplay = ForecastDisplay(weatherData)
    val hitIndexDisplay = HitIndexDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)
}
