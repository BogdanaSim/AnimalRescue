package Models;

public class Duck extends Animal{
    private double wingspan;
    private boolean domestic;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public boolean getDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public void quack(){
        System.out.println("Duck with name "+getName()+": Quack Quack Quack");

    }

    @Override
    public String speak() {
        return "Quack!";
    }

    @Override
    public String toString() {
        return super.toString()+"\n->"+"Duck{" +
                "wingspan=" + wingspan +
                ", domestic=" + domestic +
                '}';
    }
}
