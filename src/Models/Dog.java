package Models;

public class Dog extends Animal{
    private String job;

    public Dog() {
    }

    public Dog(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void bark(){
        System.out.println("Dog with name "+getName()+": Woof Woof Woof");
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "job='" + job + '\'' +
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
    public int speed() {
        return 15;
    }

    @Override
    public String walk() {
        return "RUUUUUUN";
    }
}
