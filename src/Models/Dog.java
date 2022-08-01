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
}