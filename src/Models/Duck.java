package Models;

public class Duck extends Animal{
    private double wingspan;
    private boolean isDomestic;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public boolean getIsDomestic() {
        return isDomestic;
    }

    public void setIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    public void quack(){
        System.out.println("Duck with name "+getName()+": Quack Quack Quack");

    }
}
