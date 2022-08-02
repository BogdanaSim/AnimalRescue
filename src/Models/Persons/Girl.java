package Models.Persons;


import Models.Animals.Animal;
import Models.Food.AnimalFood;
import Models.Food.SpecialDogFood;

public class Girl extends Person implements IAdopter{
    private boolean petLove=true;
    private Animal adoptedPet;


    public Girl() {
    }


    @Override
    public void adopt(Animal animal) {
        this.adoptedPet=animal;
        System.out.println("The animal named '"+animal.getName()+"' was adopted");

    }


    public void feedAnimal(AnimalFood food){
        adoptedPet.eat(food);
    }

    public void playWithAnimal()
    {
        adoptedPet.play();
    }

    public void walkAnimal(){

    }

    public void sendToVet(Veterinarian veterinarian,Nurse nurse){
        veterinarian.provideTreatment(adoptedPet,nurse);
    }

    public void nameAnimal(String name) {
        adoptedPet.setName(name);

    }
    public void doHomework(){
        System.out.println("Girl named "+this.getName()+" did some homework");
    }

    public void routine(){
        SpecialDogFood specialDogFood=new SpecialDogFood();
        this.adoptedPet.wakeUp();
        this.feedAnimal(specialDogFood);
        this.walkAnimal();
        this.adoptedPet.sleep();
        this.doHomework();
        this.adoptedPet.wakeUp();
        this.playWithAnimal();
        this.walkAnimal();
        this.feedAnimal(specialDogFood);
        this.adoptedPet.sleep();
    }
}
