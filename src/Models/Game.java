package Models;

public class Game {
    private Adopter adopter;
    private Animal dog;
    private Veterinarian veterinarian;


    public Game() {
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
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
