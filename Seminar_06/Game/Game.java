import heroTypes.*;
import java.util.*;

public class Game {
    private static final int[] l = {0};
    private static final List<BaseHero> darkSide = new ArrayList<>();
    private static final List<BaseHero> whiteSide = new ArrayList<>();
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");

    public static void main(String[] args) {
        int step = 1;
        init();
        Scanner in = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        in.nextLine();

        while (true) {
            if (step == 1 ){
                System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
            } else {
                System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
            }
            step++;

            view();

            darkSide.forEach(BaseHero::setStatus);
            whiteSide.forEach(BaseHero::setStatus);

            darkSide.forEach((s) -> s.step(whiteSide));
            whiteSide.forEach((s) -> s.step(darkSide));

            in.nextLine();
        }
    }
    private static void init() {
        int x = 1;
        int y = 1;
        darkSide.add(new Peasant(darkSide, x++, y));
        darkSide.add(new Brigand(darkSide, x++, y));
        darkSide.add(new Sniper(darkSide, x++, y));
        darkSide.add(new Wizard(darkSide, x++, y));
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    darkSide.add(new Peasant(darkSide, x++, y));
                    break;
                case 1:
                    darkSide.add(new Brigand(darkSide, x++, y));
                    break;
                case 2:
                    darkSide.add(new Sniper(darkSide, x++, y));
                    break;
                default:
                    darkSide.add(new Wizard(darkSide, x++, y));
            }
        }

        x = 1;
        y = 10;
        whiteSide.add(new Peasant(whiteSide, x++, y));
        whiteSide.add(new Monk(whiteSide, x++, y));
        whiteSide.add(new Crossbowman(whiteSide, x++, y));
        whiteSide.add(new Spearman(whiteSide, x++, y));

        for (int i = 0; i < 6; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    whiteSide.add(new Peasant(whiteSide, x++, y));
                    break;
                case 1:
                    whiteSide.add(new Monk(whiteSide, x++, y));
                    break;
                case 2:
                    whiteSide.add(new Crossbowman(whiteSide, x++, y));
                    break;
                default:
                    whiteSide.add(new Spearman(whiteSide, x++, y));
            }
        }
    }
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf("%"+ dif +"s", ":\t"); else System.out.print(":\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
    private static String getChar(int x, int y){
        String out = "| ";
        for (int cnt = 0; cnt < darkSide.size(); cnt++) {
            if (darkSide.get(cnt).getPosition().x == x && darkSide.get(cnt).getPosition().y == y) {
                out = "|" + (AnsiColors.ANSI_BLUE + darkSide.get(cnt).getName().charAt(0) + AnsiColors.ANSI_RESET);
            } else if (whiteSide.get(cnt).getPosition().x == x && whiteSide.get(cnt).getPosition().y == y) {
                out = "|" + (AnsiColors.ANSI_GREEN + whiteSide.get(cnt).getName().charAt(0) + AnsiColors.ANSI_RESET);
            }
        }
        return out;
    }
    private static void view() {
        darkSide.forEach((v) -> l[0] = Math.max(l[0], v.returnCondition().length()));
        for (int i = 0; i < l[0]*2; i++) System.out.print("_");
        System.out.println("");
        System.out.print(top10 + "    ");
        System.out.print("Blue side");
        for (int i = 0; i < l[0]-9; i++) System.out.print(" ");
        System.out.println(":\tGreen side");
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print("|    ");
        System.out.print(darkSide.get(0).returnCondition());
        tabSetter(darkSide.get(0).returnCondition().length(), l[0]);
        System.out.println(whiteSide.get(0).returnCondition());
        System.out.println(midl10);

        for (int i = 2; i < 9; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|    ");
            System.out.print(darkSide.get(i-1).returnCondition());
            tabSetter(darkSide.get(i-1).returnCondition().length(), l[0]);

            System.out.println(whiteSide.get(i-1).returnCondition());
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|    ");
        System.out.print(darkSide.get(9).returnCondition());
        tabSetter(darkSide.get(9).returnCondition().length(), l[0]);
        System.out.println(whiteSide.get(9).returnCondition());
        System.out.println(bottom10);
    }
}