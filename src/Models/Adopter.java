package Models;

public class Adopter {
    public String name;
    public float availableBudget;

    public Adopter() {

    }

    public Adopter(String name, float availableBudget) {
        this.name = name;
        this.availableBudget = availableBudget;
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", availableBudget=" + availableBudget +
                '}';
    }
}
