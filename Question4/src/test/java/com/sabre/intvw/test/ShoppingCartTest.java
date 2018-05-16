package com.sabre.intvw.test;

import com.sabre.intvw.Book;
import com.sabre.intvw.ShippingSchedulerImpl;
import com.sabre.intvw.ShoppingCart;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    @org.junit.Test
    public void checkoutOneSch() throws Exception {
        ShoppingCart sc = new ShoppingCart(new ShippingSchedulerImpl(new Date()));
        Book book1 = new Book("To Kill a Mocking Bird");
        sc.addBook(book1);
        Book book2 = new Book("Go set a watchmen");
        sc.addBook(book2);
        sc.checkout();
    }

    @org.junit.Test
    public void checkoutTwoSch() throws Exception {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        dt = c.getTime();
        ShoppingCart sc = new ShoppingCart(new ShippingSchedulerImpl(dt));
        Book book1 = new Book("The Firm");
        sc.addBook(book1);
        sc.checkout();
        c.add(Calendar.DATE, 7);
        dt = c.getTime();
        sc = new ShoppingCart(new ShippingSchedulerImpl(dt));
        Book book2 = new Book("The Painted House");
        sc.addBook(book2);
        sc.checkout();
    }
}