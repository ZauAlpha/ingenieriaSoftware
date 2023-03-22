package Observer;

public class ForecastDisplay implements DisplayElement, Observer{
    private float preasure;
    private float humidity;
    private float temperature;
    private Subject weatherData;
    ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        if(preasure > 29.92)
            System.out.println("Forecast: sunny");
        else if (preasure < 29.92)
            System.out.println("Forecast: rainy");
        else System.out.println("Forecast: stable");
    }

    @Override
    //update preasure, humidity, temperature
    public void update(float temp, float humidity, float preasure) {
       this.humidity = humidity;
       this.preasure = preasure;
       this.temperature = temp;
       display();
    }

}
