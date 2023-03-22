package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float preasure;


    WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,preasure);
        }
    }
    public void measurementChanged(){
        notifyObservers();
    }
    public void setMeasurments(float temperature, float humidity, float preasure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.preasure = preasure;
        measurementChanged();
    }
}
