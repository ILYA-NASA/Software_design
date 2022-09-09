package Home_01;

import Home_01.Abstracts.BaseHero;
import Home_01.Characters.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int step = 0;

        List<BaseHero> mordor = new ArrayList<>();
        List<BaseHero> isengard = new ArrayList<>();

        mordor.add(new Peasant(mordor, 0, 0));
        mordor.add(new Outlaw(mordor, 0, 0));
        mordor.add(new Sniper(mordor, 0, 0));

        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            switch (rnd.nextInt(4)) {
                case 0 -> mordor.add(new Peasant(mordor, 0, 0));
                case 1 -> mordor.add(new Outlaw(mordor, 0, 0));
                case 2 -> mordor.add(new Sniper(mordor, 0, 0));
                default -> mordor.add(new Magician(mordor, 0, 0));
            }
        }

        isengard.add(new Monk(isengard, 0, 0));
        isengard.add(new Crossbowman(isengard, 0, 0));
        isengard.add(new Spearman(isengard, 0, 0));

        for (int i = 0; i < 5; i++) {
            switch (rnd.nextInt(4)) {
                case 0 -> isengard.add(new Monk(isengard, 0, 0));
                case 1 -> isengard.add(new Crossbowman(isengard, 0, 0));
                case 2 -> isengard.add(new Spearman(isengard, 0, 0));
                default -> isengard.add(new Magician(isengard, 0, 0));
            }
        }

        if (step == 0) {
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Dark side\t\t\t\t\t\t\tWhite side");
        for (int i = 0; i < mordor.size(); i++) {
            if (mordor.get(i).returnCondition().length() > 27) {
                System.out.println(mordor.get(i).returnCondition() + "\t:\t" + isengard.get(i).returnCondition());
            } else {
                System.out.println(mordor.get(i).returnCondition() + "\t\t:\t" + isengard.get(i).returnCondition());
            }
        }
        Scanner in = new Scanner(System.in);
        while (true) {
            String txt = in.nextLine();
            if (txt.equals("next")) {
                for (int i = 0; i < mordor.size(); i++) {
                    mordor.get(i).step();
                    isengard.get(i).step();
                    if (mordor.get(i).returnCondition().length() > 27) {
                        System.out.println(
                                mordor.get(i).returnCondition() + "\t:\t" + isengard.get(i).returnCondition());
                    } else {
                        System.out.println(
                                mordor.get(i).returnCondition() + "\t\t:\t" + isengard.get(i).returnCondition());
                    }
                }
            }
            if (txt.equals("quit")) {
                break;
            }
        }

    }
}