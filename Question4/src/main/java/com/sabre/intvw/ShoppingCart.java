package com.sabre.intvw;

import com.sabre.intvw.AmazonService;

import java.util.*;

//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================


//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct ShippingScheduler;
//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class Book;


public class ShoppingCart {
    public ShoppingCart(ShippingScheduler shippingScheduler) {
        this.shippingScheduler = shippingScheduler;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkout() {
        for (Book book : books)
        {
            if (AmazonService.getInstance().checkout(book)) {
                this.shippingScheduler.schedule(book);
            }
        }
        this.shippingScheduler.getSchedule();
    }

    private ArrayList<Book> books = new ArrayList<Book>();
    private ShippingScheduler shippingScheduler;

}