package Models;

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
    public String toString() {
        return super.toString()+"\n->"+"Cat{" +
                "favouriteFish='" + favouriteFish + '\'' +
                ", purring=" + purring +
                '}';
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}
