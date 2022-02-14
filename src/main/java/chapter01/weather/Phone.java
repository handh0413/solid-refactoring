package chapter01.weather;

public class Phone implements Notifier {

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "";
        if (weatherConditions == "rainy")
            alert = "It is " + weatherConditions;
        return alert;
    }
}
