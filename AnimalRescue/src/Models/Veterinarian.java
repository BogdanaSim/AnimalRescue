package Models;

public class Veterinarian {
    public String name;
    public String specialization;

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
