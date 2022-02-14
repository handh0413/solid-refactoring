package chapter01.birds;

public class Eagle extends Bird implements Flyable, Moltable {

    public Eagle(int initialFeatherCount) {
        super(initialFeatherCount);
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }
}
