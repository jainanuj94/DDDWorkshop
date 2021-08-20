package com.dddworkshop;

import com.dddworkshop.domain.Cart;
import com.dddworkshop.domain.Item;
import com.dddworkshop.domain.Product;

public class Main {

    public static void main(String[] args) {
        final Item iPadPro = new Item(new Product("IPad Pro"), 1);
        final Item heroInkPen = new Item(new Product("Hero Ink Pen"), 1);
        final Item gmCricketBat = new Item(new Product("GM Cricket bat"), 2);

        Cart cart = new Cart();
        cart.add(iPadPro);
        cart.add(heroInkPen);
        cart.add(gmCricketBat);

        System.out.println(cart);

        cart.remove(iPadPro);

        System.out.println(cart);

        System.out.println("Deleted Items: " + cart.getDeletedItems());
    }
}
