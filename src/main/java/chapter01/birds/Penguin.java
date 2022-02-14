package chapter01.birds;

public class Penguin implements Bird {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() {
        throw new UnsupportedOperationException();
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
