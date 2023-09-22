package apilearn.dateandtime;

import  java.util.*;
public class DateApi
{
    public static void main(String[] args)
    {
        //Date Representation;
       // System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        // Date Class
//        Date d = new Date();
//        System.out.println("Date Class is "+d);

        // Calender Class;

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
    }
}
