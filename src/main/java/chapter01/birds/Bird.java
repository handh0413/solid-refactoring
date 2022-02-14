package chapter01.birds;

public abstract class Bird {
    String currentLocation;
    int numberOfFeathers;

    public Bird(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }
}
