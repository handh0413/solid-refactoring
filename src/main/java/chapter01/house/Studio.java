package chapter01.house;

public class Studio {
    // Ctrl + Alt + Shift + T → Push Members Down
    int squareFootage;
    int numberOfBedrooms;

    public Studio() {
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
