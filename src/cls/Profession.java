package cls;

import java.util.Random;

public enum Profession {
    Math,
    Chemistryy,
    Geography,
    Literature,
    Physics,
    Sports;

    public static Profession randomProfession() {
        Random random = new Random();
        Profession []professions = values();
        return professions[random.nextInt(professions.length)];
    }

}
