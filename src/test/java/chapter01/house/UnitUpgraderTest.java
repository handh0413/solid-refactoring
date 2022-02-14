package chapter01.house;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitUpgraderTest {

    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgrade(penthouse);

        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToPenthouses() {
        PenthouseSuite penthouse = new PenthouseSuite();
        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgrade(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgrade(studio);

        assertEquals(590, studio.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToStudios() {
        Studio studio = new Studio();
        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgrade(studio);

        assertEquals(0, studio.numberOfBedrooms);
    }
}
