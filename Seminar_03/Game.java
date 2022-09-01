import heroTypes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int step = 0;
        List<BaseHero> darkSide = new ArrayList<BaseHero>();
        List<BaseHero> whiteSide = new ArrayList<BaseHero>();

        darkSide.add(new Peasant(darkSide, 0, 0));
        darkSide.add(new Brigand(darkSide, 0, 0));
        darkSide.add(new Sniper(darkSide, 0, 0));
        darkSide.add(new Sorcerer(darkSide, 0, 0));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    darkSide.add(new Peasant(darkSide, 0, 0));
                    break;
                case 1:
                    darkSide.add(new Brigand(darkSide, 0, 0));
                    break;
                case 2:
                    darkSide.add(new Sniper(darkSide, 0, 0));
                    break;
                default:
                    darkSide.add(new Crossbowman(darkSide, 0, 0));
            }
        }

        whiteSide.add(new Peasant(darkSide, 0, 0));
        whiteSide.add(new Monk(darkSide, 0, 0));
        whiteSide.add(new Crossbowman(darkSide, 0, 0));
        whiteSide.add(new Spearman(darkSide, 0, 0));
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    whiteSide.add(new Peasant(darkSide, 0, 0));
                    break;
                case 1:
                    whiteSide.add(new Monk(darkSide, 0, 0));
                    break;
                case 2:
                    whiteSide.add(new Sorcerer(darkSide, 0, 0));
                    break;
                default:
                    whiteSide.add(new Spearman(darkSide, 0, 0));
            }
        }

        if (step == 0) {
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Dark side\t\t\t\t\t\t\tWhite side");
        for (int i = 0; i < darkSide.size(); i++) {
            if (darkSide.get(i).returnCondition().length() > 27) {
                System.out.println(darkSide.get(i).returnCondition() + "\t:\t" + whiteSide.get(i).returnCondition());
            } else {
                System.out.println(darkSide.get(i).returnCondition() + "\t\t:\t" + whiteSide.get(i).returnCondition());
            }
        }
        Scanner in = new Scanner(System.in);
        while (true) {
            String txt = in.nextLine();
            if (txt.equals("next")) {
                for (int i = 0; i < darkSide.size(); i++) {
                    darkSide.get(i).step();
                    whiteSide.get(i).step();
                    if (darkSide.get(i).returnCondition().length() > 27) {
                        System.out.println(
                                darkSide.get(i).returnCondition() + "\t:\t" + whiteSide.get(i).returnCondition());
                    } else {
                        System.out.println(
                                darkSide.get(i).returnCondition() + "\t\t:\t" + whiteSide.get(i).returnCondition());
                    }
                }
            }
            if (txt.equals("quit")) {
                break;
            }
        }

    }
}
