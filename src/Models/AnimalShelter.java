package Models;

import Models.Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Animal> availableAnimals;

    public AnimalShelter() {
        this.availableAnimals=new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        availableAnimals.add(animal);
    }

    public void removeAnimal(Animal animal){
        availableAnimals.remove(animal);
    }
}
