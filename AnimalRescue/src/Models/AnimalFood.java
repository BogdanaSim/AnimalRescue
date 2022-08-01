package Models;

import java.util.Date;

public class AnimalFood {
    public String name;
    public float price;
    public float quantity;
    public Date expirationDate;
    public boolean availabilityStock;

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
