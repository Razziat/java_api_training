package fr.lernejo.navy_battle;

import java.util.List;
import java.util.ArrayList;

public class Attack {
    final private List<String> nextAttack;

    public Attack() {
        nextAttack = initAttacks();
    }

    private List<String> initAttacks() {
        List<String> allAttacks = new ArrayList<>(100);
        for (char c = 'A'; c <= 'J'; c++){
            for (char d = '0'; d <= '9'; d++) {
                String firstValue = String.valueOf(c);
                allAttacks.add(firstValue + d);
            }
        }
        return allAttacks;
    }

    public String getAttack() {
        String currentAttack = nextAttack.get(0);
        nextAttack.remove(0);
        return currentAttack;
    }
}
