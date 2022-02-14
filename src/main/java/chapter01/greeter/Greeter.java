package chapter01.greeter;

public class Greeter {
    String formality;

    public String greet() {
        // alt + enter > create class ~
        // alt + enter > join declaration and assignment
        PersonalityFactory factory = PersonalityFactory.getInstance();
        Personality personality = factory.getPersonality(formality);
        return personality.greet();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
