package Models;

public class Animal {
    public String name;
    public int age;
    public int healthLevel;
    public int hungerLevel;
    public int spiritLevel;
    public String favoriteFood;
    public String favoriteActivity;

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", spiritLevel=" + spiritLevel +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                '}';
    }
}
