package Main;

import Models.*;
import Models.Animals.Cat;
import Models.Animals.Dog;
import Models.Animals.Duck;
import Models.Food.DogFood;
import Models.Food.WetFood;
import Models.Persons.Father;
import Models.Persons.Girl;
import Models.Persons.Nurse;
import Models.Persons.Veterinarian;

import java.time.LocalDateTime;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Father father = new Father();

        Girl girl = new Girl();
        girl.setName("Ana");
        girl.setAge(7);
        girl.setHairColor("Brown");
        girl.setHeight(10);


        Dog dog = new Dog();
        dog.setName("Default");
        dog.setBreed("Corcitura de labrador");
        dog.setAge(5);
        dog.setWeight(1);
        dog.setSpiritLevel(1);
        dog.setHappiness(HappinessStates.SAD);
        dog.setHungry(false);
        dog.setScared(true);

        Cat cat = new Cat();
        cat.setName("Cat");
        cat.setAge(2);

        Duck duck = new Duck();

        AnimalShelter shelter = new AnimalShelter();
        shelter.addAnimal(dog);
        shelter.addAnimal(cat);
        shelter.addAnimal(duck);

        girl.adopt(dog);
        shelter.removeAnimal(dog);

        girl.nameAnimal("Dog");

        DogFood dogFood = new DogFood();
        girl.feedAnimal(dogFood);
        girl.playWithAnimal();

        Veterinarian veterinarian=new Veterinarian();
        veterinarian.setName("George");
        veterinarian.setSpecialization("Surgery");

        Nurse nurse=new Nurse();
        nurse.setName("Ella");
        girl.sendToVet(veterinarian,nurse);

        WetFood wetFood=new WetFood();
        for(int i=0;i<2;i++)
            girl.feedAnimal(wetFood);

        for(int i=0;i<10;i++)
            girl.routine();

    }
}
