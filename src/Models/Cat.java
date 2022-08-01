package Models;

public class Cat extends Animal{
    private String favouriteFish;
    private boolean isPurring;

    public String getFavouriteFish() {
        return favouriteFish;
    }

    public void setFavouriteFish(String favouriteFish) {
        this.favouriteFish = favouriteFish;
    }

    public boolean isPurring() {
        return isPurring;
    }

    public void setPurring(boolean purring) {
        isPurring = purring;
    }

    public void meow(){
        System.out.println("Cat with name "+getName()+": meow meow meow");
    }

    public void checkPurring(){
        if(isPurring)
            System.out.println("The cat named "+getName()+"is purring. It seems happy!");
        else System.out.println("The cat named "+getName()+"is not purring. It might sleep!");
    }
}
