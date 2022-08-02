package Models.Animals;


import Models.Food.AnimalFood;
import Models.Food.SpecialDogFood;
import Models.HappinessStates;

public class Dog extends Animal{
    private String job;
    private String breed;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private boolean scared;

    public Dog() {
    }

    public boolean isScared() {
        return scared;
    }

    public void setScared(boolean scared) {
        this.scared = scared;
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
    public void walk() {
        this.setHappiness(HappinessStates.HAPPY);
        if(this.getSpiritLevel()<10)
            this.setSpiritLevel(this.getSpiritLevel()+1);
        this.setWeight(this.getWeight()-1);
    }

    @Override
    public void play() {
        if(this.getHealthLevel()<10)
            this.setHealthLevel(this.getHealthLevel()+1);
        this.setWeight(this.getWeight()-1);


    }

    @Override
    public void calm() {
        this.scared=false;
        if(this.getSpiritLevel()<10)
            this.setSpiritLevel(this.getSpiritLevel()+1);
        this.setHappiness(HappinessStates.NEUTRAL);
    }

    @Override
    public void raiseFear() {
        this.scared=true;
        this.setHappiness(HappinessStates.SAD);
        if(this.getSpiritLevel()>0)
            this.setSpiritLevel(this.getSpiritLevel()-1);

    }

    @Override
    public void sleep() {
        setAwake(false);
    }

    @Override
    public void wakeUp() {
        setAwake(true);
    }

    @Override
    public void eat(AnimalFood animalFood) {
        if(animalFood.getClass()== SpecialDogFood.class)
            this.setWeight(this.getWeight()+2);
        else
            this.setWeight(this.getWeight()+5);
        if(this.getSpiritLevel()<10)
            this.setSpiritLevel(this.getSpiritLevel()+1);
        this.setHappiness(HappinessStates.NEUTRAL);

    }
}
