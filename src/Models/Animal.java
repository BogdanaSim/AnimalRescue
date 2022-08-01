package Models;

public abstract class Animal{
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int spiritLevel;
    private String favoriteFood;
    private String favoriteActivity;

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

    public Animal() {
    }


    public abstract String toString() ;

    public abstract String speak();

    public abstract int speed();

    public abstract String walk();
}
