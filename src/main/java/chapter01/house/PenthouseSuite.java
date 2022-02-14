package chapter01.house;

public class PenthouseSuite extends Apartment {
    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
