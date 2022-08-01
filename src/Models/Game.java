package Models;

public class Game {
    public Adopter adopter;
    public Animal dog;
    public Veterinarian veterinarian;

    @Override
    public String toString() {
        return "Game{" +
                "adopter=" + adopter +
                ", dog=" + dog +
                ", veterinarian=" + veterinarian +
                '}';
    }
}
