package chapter01.house;

public class Studio extends Apartment {
    public Studio() {
        this.numberOfBedrooms = 0;
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
