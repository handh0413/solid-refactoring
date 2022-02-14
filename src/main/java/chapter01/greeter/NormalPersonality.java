package chapter01.greeter;

public class NormalPersonality implements Personality {
    @Override
    public String greet() {
        return "Hello.";
    }
}
