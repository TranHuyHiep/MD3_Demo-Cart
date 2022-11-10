package model;

public class Cart {
    private int id_product;
    private int amount;
    private double totalPrice;

    public Cart() {
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Cart(int id_product, int amount, double totalPrice) {
        this.id_product = id_product;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }
}