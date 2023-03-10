package observerPattern;

public class WeatherObserver implements Observer{

    private int temperature;
    private int pressure;
    private int humidity;

    private Subject subject;

    public WeatherObserver(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update(int temperater, int pressure, int humidity) {
        this.temperature = temperater;
        this.pressure = pressure;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("temperature : " + temperature);
        System.out.println("pressure : " + pressure);
        System.out.println("humidity : " + humidity);
    }
}
