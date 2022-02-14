package chapter01.weather;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneTest {
    @Test
    public void testGeneratesAlertString() {
        Email email = new Email();
        assertEquals("It is rainy", email.generateWeatherAlert("rainy"));
    }
}
