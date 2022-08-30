package Home_01;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, String> FellowshipOfRing = new HashMap<>();
        FellowshipOfRing.put("Peasant", "Frodo");
        FellowshipOfRing.put("Outlaw", "Sauron");
        FellowshipOfRing.put("Sniper", "Legolas");
        FellowshipOfRing.put("Magician", "Gandalf");
        FellowshipOfRing.put("Spearman", "Gimli");
        FellowshipOfRing.put("Crossbowman", "Aragorn");
        FellowshipOfRing.put("Monk", "Arwen");

        // String keyNameHero = "Crossbowman";
        // if(FellowshipOfRing.containsKey(keyNameHero)){
        //     new Crossbowman(FellowshipOfRing.get(keyNameHero));
        // }
        
        new Crossbowman();
        System.out.println(Crossbowman.getInfo());
    }
}
