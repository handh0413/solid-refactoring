package chapter01.greeter;

public class FormalPersonality implements Personality {
    @Override
    public String greet() {
        return "Good evening, sir.";
    }
}
