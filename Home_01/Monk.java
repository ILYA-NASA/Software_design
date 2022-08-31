package Home_01;

public class Monk {
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
    public Monk() {
        name = "Arwen Undómiel";
        attack = 12;
        protection = 7;
        shots = 0;
        damage[0] = -4;
        damage[1] = -4;
        health = 30;
        speed = 5;
        delivery = false;
        magic = true;
    }

    /**
     * дополнительный конструктор
     * 
     * @param name
     */
    public Monk(String name) {
        this.name = name;
    }

    /**
     * геттер приватных полей
     * 
     * @return строку с описанием персонажа
     */
    public static String getInfo() {
        return String.valueOf("Монах по имени " + name +
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
