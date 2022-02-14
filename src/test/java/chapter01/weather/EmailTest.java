package chapter01.weather;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {
    @Test
    public void testGeneratesAlertString() {
        Email email = new Email();
        assertEquals("It is sunny", email.generateWeatherAlert("sunny"));
    }
}
