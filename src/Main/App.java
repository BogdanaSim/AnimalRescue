package Main;

import Models.*;

import java.time.LocalDateTime;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Animal dog=new Animal();
        dog.setName("Chris");
        dog.setAge(5);
        dog.setHealthLevel(9);
        dog.setHungerLevel(2);
        dog.setSpiritLevel(8);
        dog.setFavoriteFood("Meat");
        dog.setFavoriteActivity("Play fetch");
        Adopter adopter=new Adopter();
        adopter.setName("Michael Jones");
        adopter.setAvailableBudget(500);
        AnimalFood animalFood=new AnimalFood();
        animalFood.setName("Meat");
        animalFood.setPrice(50);
        animalFood.setQuantity(100);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.NOVEMBER, 11);
        animalFood.setExpirationDate(calendar.getTime());
        animalFood.setAvailabilityStock(true);
        RecreationActivity recreationActivity=new RecreationActivity();
        recreationActivity.setName("Play with ball");
        Veterinarian veterinarian=new Veterinarian();
        veterinarian.setName("Ana Mary");
        veterinarian.setSpecialization("Surgery");
        Game game=new Game();
        game.setAdopter(adopter);
        game.setDog(dog);
        game.setVeterinarian(veterinarian);
        System.out.println(dog);
        System.out.println("Animal favorite food: "+dog.getFavoriteFood());
        System.out.println(adopter);
        System.out.println("Adopter name: "+adopter.getName());
        System.out.println(animalFood);
        System.out.println("Animal food quantity: "+animalFood.getQuantity());
        System.out.println(recreationActivity);
        System.out.println("Recreation activity name: "+recreationActivity.getName());
        System.out.println(veterinarian);
        System.out.println("Veterinarian specialization: "+veterinarian.getSpecialization());
        System.out.println(game);
        System.out.println("Game veterinarian: "+game.getVeterinarian());
        System.out.println("Game dog: "+game.getDog());
    }
}
