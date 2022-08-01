package Models;

public class Veterinarian {
    public String name;
    public String specialization;

    public Veterinarian() {
    }

    public Veterinarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
