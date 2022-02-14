package chapter01.house;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitUpgraderTest {

    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        SquareFootageUpgrader upgrader = new SquareFootageUpgrader();
        upgrader.penthouseSquareFootageUpgrade(penthouse);

        assertEquals(1540, penthouse.squareFootage);
    }

    @Test
    public void testUpgraderAddsBedroomToPenthouses() {
        PenthouseSuite penthouse = new PenthouseSuite();
        BedroomUpgrader upgrader = new BedroomUpgrader();
        upgrader.penthouseBedroomUpgrade(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);
        SquareFootageUpgrader upgrader = new SquareFootageUpgrader();
        upgrader.studioSquareFootageUpgrade(studio);

        assertEquals(590, studio.squareFootage);
    }
}
