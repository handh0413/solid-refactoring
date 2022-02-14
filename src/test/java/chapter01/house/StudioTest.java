package chapter01.house;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfBedrooms);
    }

    @Test
    public void testSetsSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(600);
        assertEquals(600, studio.squareFootage);
    }
}
