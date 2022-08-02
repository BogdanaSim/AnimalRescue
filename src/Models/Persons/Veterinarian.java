package Models.Persons;

import Models.Animals.Animal;
import Models.Animals.Dog;

public class Veterinarian implements IVet{
    private String name;
    private String specialization;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void vaccinate(Animal animal) {
        if(animal.getHealthLevel()<10)
            animal.setHealthLevel(animal.getHealthLevel()+1);
    }

    @Override
    public void disinfest(Animal animal) {

    }

    @Override
    public void provideTreatment(Animal animal, Nurse nurse) {
        this.vaccinate(animal);
        this.disinfest(animal);
        nurse.petAnimal(animal);

    }
}
