package model;

public class Product {
    private int id;
    private String img;
    private String name;
    private int amount;
    private double price;

    public Product() {
    }

    public Product(String img, String name, int amount, double price) {
        this.img = img;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Product(int id, String img, String name, int amount, double price) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
