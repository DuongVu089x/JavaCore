package com.dav.javacore.calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Năm hiện tại : " + calendar.get(Calendar.YEAR));

        System.out.println("Tháng hiện tại : " +(calendar.get(Calendar.MONTH) + 1 ));
        System.out.println("Ngày hiện tại : " +calendar.get(Calendar.DATE));

        System.out.println("Lấy giờ định dạng 12 là : "+ calendar.get(Calendar.HOUR));

        System.out.println("Lấy giờ định dạng 24 là : "+ calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Phút hiện tại : " +calendar.get(Calendar.MINUTE));
        System.out.println("Giây hiện tại : " +calendar.get(Calendar.SECOND));
        System.out.println("Mili giây hiện tại: " +calendar.get(Calendar.MILLISECOND));
    }
}
