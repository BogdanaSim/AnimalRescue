package Models;

public class Game {
    public Adopter adopter;
    public Animal dog;
    public Veterinarian veterinarian;


    public Game() {
    }

    public Game(Adopter adopter, Animal dog, Veterinarian veterinarian) {
        this.adopter = adopter;
        this.dog = dog;
        this.veterinarian = veterinarian;
    }

    @Override
    public String toString() {
        return "Game{" +
                "adopter=" + adopter +
                ", dog=" + dog +
                ", veterinarian=" + veterinarian +
                '}';
    }
}
