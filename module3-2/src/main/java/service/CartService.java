package service;

import model.Cart;

import java.util.ArrayList;

public class CartService {
    public static ArrayList<Cart> carts = new ArrayList<>();

    public void add(Cart cart) {
        carts.add(cart);
    }

    public void reset() {
        carts = new ArrayList<>();
    }
}
