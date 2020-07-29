import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private int strength, dexterrity, constitution, intelligence, wisdom, charisma;

    public DnDCharacter() {
        this.strength = this.ability();
        this.dexterrity = this.ability();
        this.constitution = this.ability();
        this.intelligence = this.ability();
        this.wisdom = this.ability();
        this.charisma = this.ability();
    }

    int ability() {
        List<Integer> numberRolls = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            numberRolls.add(random.nextInt(6) + 1);
        }
        Collections.sort(numberRolls, Collections.reverseOrder());
        return numberRolls.get(0) + numberRolls.get(1) + numberRolls.get(2);

    }

    int modifier(int input) {
        if (input % 2 == 1) {
            input = input - 1;
        }
        return (input - 10) / 2;
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterrity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.modifier(this.constitution) + 10;
    }

}
