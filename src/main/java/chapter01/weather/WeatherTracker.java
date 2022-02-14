package chapter01.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<Notifier> notifiers;

    public WeatherTracker() {
        notifiers = new ArrayList<>();
        notifiers.add(new Phone());
        notifiers.add(new Email());
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        for (Notifier notifier : notifiers) {
            notifier.generateWeatherAlert(weatherDescription);
        }
    }
}
