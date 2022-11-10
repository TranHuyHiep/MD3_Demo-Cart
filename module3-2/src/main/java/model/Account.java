package model;

import java.time.LocalDate;

public class Account {
    private int id;
    private String username;
    private String password;
    private String phonenumber;
    private String email;
    private LocalDate birthday;
    private boolean stautus;
    private int id_role;

    public Account() {
    }

    public Account(String username, String password, String phonenumber, String email, LocalDate birthday, boolean stautus, int id_role) {
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.email = email;
        this.birthday = birthday;
        this.stautus = stautus;
        this.id_role = id_role;
    }

    public Account(int id, String username, String password, String phonenumber, String email, LocalDate birthday, boolean stautus, int id_role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.email = email;
        this.birthday = birthday;
        this.stautus = stautus;
        this.id_role = id_role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStautus() {
        return stautus;
    }

    public void setStautus(boolean stautus) {
        this.stautus = stautus;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
}
