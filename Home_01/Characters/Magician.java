package Home_01.Characters;

public class Magician {
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
    public Magician() {
        name = "Gandalf the Grey";
        attack = 17;
        protection = 12;
        shots = 0;
        damage[0] = -5;
        damage[1] = -5;
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
    }

    /**
     * дополнительный конструктор
     * 
     * @param name
     */
    public Magician(String name) {
        this.name = name;
    }

    /**
     * геттер приватных полей
     * 
     * @return строку с описанием персонажа
     */
    public static String getInfo() {
        return String.valueOf("Колдун по имени " + name +
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
