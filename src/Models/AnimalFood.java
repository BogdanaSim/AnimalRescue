package Models;

import java.util.Date;

public class AnimalFood {
    public String name;
    public float price;
    public float quantity;
    public Date expirationDate;
    public boolean availabilityStock;

    public AnimalFood() {
    }

    public AnimalFood(String name, float price, float quantity, Date expirationDate, boolean availabilityStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.availabilityStock = availabilityStock;
    }

    @Override
    public String toString() {
        return "AnimalFood{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expirationDate=" + expirationDate +
                ", availabilityStock=" + availabilityStock +
                '}';
    }
}
