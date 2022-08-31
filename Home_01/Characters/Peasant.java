package Home_01;

public class Peasant{
    // описание песонажа
    private static String name;
    private static int attack;
    private static int protection;
    private static int shots;
    private static int[] damage = new int[2];
    private static int health;
    private static int speed;
    private static boolean delivery;
    private static boolean magic;

    /**
     * конструктор без параметров
     */
    public Peasant() {
        name = "Frodo Baggins";
        attack = 1;
        protection = 1;
        shots = 0;
        damage[0] = 1;
        damage[1] = 1;
        health = 1;
        speed = 3;
        delivery = true;
        magic = false;
    }

    /**
     * дополнительный конструктор
     * 
     * @param name
     */
    public Peasant(String name) {
        this.name = name;
    }

    /**
     * геттер приватных полей
     * 
     * @return строку с описанием персонажа
     */
    public static String getInfo() {
        return String.valueOf("Крестьянин по имени " + name +
                ";\nАтакует на: " + attack +
                ";\nИмеет защиту: " + protection +
                ";\nСтреляет на: " + shots +
                ";\nНаносит урон в пределах: " + damage +
                ";\nИмеет здоровье: " + health +
                ";\nРазвивает скорость: " + speed +
                "\nНаличие доставки: " + delivery +
                "\nНаличие магии: " + magic);
    }
}
