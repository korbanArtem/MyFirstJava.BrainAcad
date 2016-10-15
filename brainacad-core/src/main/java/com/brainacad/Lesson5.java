package com.brainacad;

/**
 * Created by korban on 09.10.2016.
 */
public class Lesson5 {
    public static void main(String[] args) {
       Lesson5 lesson5= new Lesson5();
        System.out.println(lesson5.getstringMonth(11));

    }
    public String getstringMonth (int month){
        String returnMonth;
        switch (month){
            case 1 : returnMonth = "january";
              break;
            case 2 : returnMonth = "february";
               break;
            case 5 : returnMonth = "May";
                break;
                default: returnMonth = "Unknown";


        }
            return returnMonth;
        }

    }

