package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private int temperature;
    private int pressue;
    private int humidity;

    private List<Observer> observerList;

    public WeatherStation(){
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o : observerList){
            o.update(this.temperature, this.pressue, this.humidity);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setPressue(int pressue) {
        this.pressue = pressue;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }
}
