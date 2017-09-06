package com.dav.javacore.java.util.date;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDemo {

    public static void main(String[] args) throws InterruptedException {
        // Create object Date.
        Date date1 = new Date();

        // Stop in 3 seconds.
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));

        // Get millis from 01-01-1970 to now.
        long millis = System.currentTimeMillis();
        Date date2 = new Date(millis);

        // Comapte 2 object date1 and date2.
        // i < 0 mean date1 < date2
        // i = 0 mean date1 = date2
        // i > 0 mean date1 > date2
        int i = date1.compareTo(date2);

        System.out.println("date1 compareTo date2 = " + i);

        // Check date1 has before date2.
        boolean before = date1.before(date2);

        System.out.println("date1 before date2 ? " + before);

        // Check date1 has after date2.
        boolean after = date1.after(date2);

        System.out.println("date1 after date2 ? " + after);
    }
}
