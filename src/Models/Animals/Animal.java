package Models.Animals;


import Models.Food.AnimalFood;
import Models.HappinessStates;

public abstract class Animal{
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int spiritLevel;
    private String favoriteFood;
    private String favoriteActivity;
    private int weight;
    private HappinessStates happiness;
    private boolean isHungry;
    private boolean awake;

    public boolean isAwake() {
        return awake;
    }

    public void setAwake(boolean awake) {
        this.awake = awake;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HappinessStates getHappiness() {
        return happiness;
    }

    public void setHappiness(HappinessStates happiness) {
        this.happiness = happiness;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public abstract void eat(AnimalFood animalFood);

    public Animal() {
    }


    public abstract String toString() ;

    protected abstract String speak();

    protected abstract int speed();

    protected abstract void walk();

    public abstract void play();

    public abstract void calm();

    public abstract void raiseFear();

    public abstract void sleep();

    public abstract void wakeUp();
}
