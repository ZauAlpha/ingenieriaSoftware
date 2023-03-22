package Observer;

public class CurrentConditions implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float preasure;
    private Subject weatherData;

    CurrentConditions(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        //create a display for current conditions
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity, " + preasure + "preasure");

    }

    @Override
    public void update(float temp, float humidity, float preasure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.preasure = preasure;
        display();
    }

}
