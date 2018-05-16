package com.sabre.intvw;

import java.util.Date;

public class ShippingSchedulerImpl implements ShippingScheduler {
    private Date schDate;

    public ShippingSchedulerImpl(Date schdt) {
        this.schDate=schdt;
    }
    public void schedule(Book book) {
        System.out.println("Scheduling the shipping of book:"+book.read());
    }

    public void getSchedule() {
        System.out.println ("Schdeuled for "+this.schDate.toString());
    }
}
