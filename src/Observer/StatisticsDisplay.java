package Observer;

public class StatisticsDisplay implements DisplayElement, Observer{
    //create variables for showing min, max, average
    private float min=200;
    private float max=0;
    private float sum=0;
    private Subject weatherData;
    private int count = 0;
    StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sum/count) + "/" + max + "/" + min);
    }

    @Override
    public void update(float temp, float humidity, float preasure) {
        sum += temp;
        count++;
        if (temp > max)
            max = temp;
        if (temp < min)
            min = temp;
        display();
    }
}
