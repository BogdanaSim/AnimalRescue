package Models.Animals;


import Models.Food.AnimalFood;

public class Cat extends Animal{
    private String favouriteFish;
    private boolean purring;

    public String getFavouriteFish() {
        return favouriteFish;
    }

    public void setFavouriteFish(String favouriteFish) {
        this.favouriteFish = favouriteFish;
    }

    public boolean isPurring() {
        return purring;
    }

    public void setPurring(boolean purring) {
        this.purring = purring;
    }

    public void meow(){
        System.out.println("Cat with name "+getName()+": meow meow meow");
    }

    public void checkPurring(){
        if(purring)
            System.out.println("The cat named "+getName()+"is purring. It seems happy!");
        else System.out.println("The cat named "+getName()+"is not purring. It might sleep!");
    }


    @Override
    public void eat(AnimalFood animalFood) {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "favouriteFish='" + favouriteFish + '\'' +
                ", purring=" + purring +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", healthLevel=" + getHealthLevel() +
                ", hungerLevel=" + getHungerLevel() +
                ", spiritLevel=" + getSpiritLevel() +
                ", favoriteFood='" + getFavoriteFood() + '\'' +
                ", favoriteActivity='" + getFavoriteActivity() + '\'' +
                '}';
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public int speed() {
        return 10;
    }

    @Override
    public void walk() {

    }

    @Override
    public void play() {

    }

    @Override
    public void calm() {

    }

    @Override
    public void raiseFear() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void wakeUp() {

    }


}
