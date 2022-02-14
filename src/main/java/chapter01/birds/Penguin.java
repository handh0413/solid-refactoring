package chapter01.birds;

public class Penguin extends Bird implements Moltable, Swimmable {

    public Penguin(int initialFeatherCount) {
        super(initialFeatherCount);
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
