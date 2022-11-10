package model;

public class Bill {
    private int id;
    private int id_account;
    private double totalprice;

    public Bill() {
    }

    public Bill(int id_account, double totalprice) {
        this.id_account = id_account;
        this.totalprice = totalprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_account() {
        return id_account;
    }

    public void setId_account(int id_account) {
        this.id_account = id_account;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
}
