package Models.Persons;

import Models.Animals.Animal;

public interface IVet {
    
    void vaccinate(Animal animal);
    
    void disinfest(Animal animal);

    void provideTreatment(Animal animal, Nurse nurse);
}
