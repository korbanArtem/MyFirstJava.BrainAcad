package com.brainacad;

/**
 * Created by korban on 09.10.2016.
 */
public class LabWork1Lesson5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.print(i);
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" " + j);
            }
            System.out.println("*");
        }

        int aa = 0;
        while (aa++<10) {
            aa++;
            if(aa==5){continue;}
            System.out.println("aa=" + aa);
        }
    }

}
