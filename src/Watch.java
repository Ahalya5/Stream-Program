import java.util.UUID;

public class Watch {


    private int id;
    private String name;
    private double price;
    private String brand;

    public Watch(int id, String name, double price, String brand) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.brand = brand;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }




}
