package model;

public class BillDetail {
    private int id;
    private int amount;
    private int id_product;
    private int id_bill;

    public BillDetail() {
    }

    public BillDetail(int amount, int id_product, int id_bill) {
        this.amount = amount;
        this.id_product = id_product;
        this.id_bill = id_bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }
}
