package com.sabre.intvw;
//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class Book;

public class AmazonService {
    public static AmazonService getInstance() {
        if (GlobalMembers.amazonService == null) {
            GlobalMembers.amazonService = new AmazonService();
        }
        return GlobalMembers.amazonService;
    }

    public boolean checkout(Book book) {
        System.out.print("Checking out book started...");
        System.out.print("\n");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Checking out book done...");
        System.out.print("\n");
        return true;
    }

    private static AmazonService amazonService;
}