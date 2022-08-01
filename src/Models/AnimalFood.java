package Models;

import java.util.Date;

public class AnimalFood {
    private String name;
    private float price;
    private int quantity;
    private Date expirationDate;
    private boolean availabilityStock;

    public AnimalFood() {
    }

    public AnimalFood(String name, float price, int quantity, Date expirationDate, boolean availabilityStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.availabilityStock = availabilityStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailabilityStock() {
        return availabilityStock;
    }

    public void setAvailabilityStock(boolean availabilityStock) {
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
