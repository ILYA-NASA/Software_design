package Home_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, String> fellowshipOfRing = new HashMap<>();
        fellowshipOfRing.put("Peasant", "Frodo");
        fellowshipOfRing.put("Outlaw", "Sauron");
        fellowshipOfRing.put("Sniper", "Legolas");
        fellowshipOfRing.put("Magician", "Gandalf");
        fellowshipOfRing.put("Spearman", "Gimli");
        fellowshipOfRing.put("Crossbowman", "Aragorn");
        fellowshipOfRing.put("Monk", "Arwen");

        List<String> keyNameHeroList = new ArrayList<>();
        keyNameHeroList.add("Crossbowman");
        keyNameHeroList.add("Outlaw");
        keyNameHeroList.add("Sniper");
        keyNameHeroList.add("Magician");
        keyNameHeroList.add("Spearman");
        keyNameHeroList.add("Crossbowman");
        keyNameHeroList.add("Monk");

        // String nameHero = fellowshipOfRing.getOrDefault(keyNameHeroList.get(1), "Имя не задано");
        // new Crossbowman(nameHero);

        new Crossbowman();
        System.out.println(Crossbowman.getInfo());
    }
}
