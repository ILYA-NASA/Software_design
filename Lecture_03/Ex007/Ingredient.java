package Lecure_03.Ex007;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) {
        Ingredient t = (Ingredient) obj;
        return t.brand == this.brand;
    }
}
