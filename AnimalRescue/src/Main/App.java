package Main;

import Models.*;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Animal dog=new Animal();
        dog.name="Chris";
        dog.age=5;
        dog.healthLevel=9;
        dog.hungerLevel=2;
        dog.spiritLevel=8;
        dog.favoriteFood="Meat";
        dog.favoriteActivity="Play fetch";
        Adopter adopter=new Adopter();
        adopter.name="Michael Jones";
        adopter.availableBudget=500;
        AnimalFood animalFood=new AnimalFood();
        animalFood.name="Meat";
        animalFood.price=50;
        animalFood.quantity=100;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.NOVEMBER, 11);
        animalFood.expirationDate=calendar.getTime();
        animalFood.availabilityStock=true;
        RecreationActivity recreationActivity=new RecreationActivity();
        recreationActivity.name="Play with ball";
        Veterinarian veterinarian=new Veterinarian();
        veterinarian.name="Ana Mary";
        veterinarian.specialization="Surgery";
        Game game=new Game();
        game.adopter=adopter;
        game.dog=dog;
        game.veterinarian=veterinarian;

    }
}
