package chapter01.greeter;

public class PersonalityFactory {
    private static PersonalityFactory instance;

    private  PersonalityFactory() { }

    public static PersonalityFactory getInstance() {
        if (instance == null) {
            instance = new PersonalityFactory();
        }
        return instance;
    }

    // ctrl + alt + m > extract method ~
    public Personality getPersonality(String formality) {
        Personality personality;
        if (formality == "formal") {
            personality = new FormalPersonality();
        } else if (formality == "casual") {
            personality = new CasualPersonality();
        } else if (formality == "intimate") {
            personality = new IntimatePersonality();
        } else {
            personality = new NormalPersonality();
        }
        // ctrl + shift + 방향키 > 코드 이동
        return personality;
    }
}
