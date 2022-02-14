package chapter01.weather;

public class Email implements Notifier {

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "";
        if (weatherConditions == "sunny")
            alert = "It is " + weatherConditions;
        return alert;
    }
}
