package Lecture_02.Ex004;

public class Druid extends BaseHero {

    public Druid(String name, int hp) {
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");

    }

    public Druid() {
        this("", 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}