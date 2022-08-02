package Models.Persons;

public class Adopter {
    public String name;
    public float availableBudget;

    public Adopter() {

    }

    public Adopter(String name, float availableBudget) {
        this.name = name;
        this.availableBudget = availableBudget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvailableBudget() {
        return availableBudget;
    }

    public void setAvailableBudget(float availableBudget) {
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
