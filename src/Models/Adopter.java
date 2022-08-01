package Models;

public class Adopter {
    public String name;
    public float availableBudget;

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", availableBudget=" + availableBudget +
                '}';
    }
}
