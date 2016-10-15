package com.brainacad;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by korban on 15.10.2016.
 */
public class LabWork_1_5_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //  do {

        //}

        while (true) {
            System.out.print("Pleas enter your value: ");
            int x = sc.nextInt();
            String valueStr;
            switch (x) {
                case 1:
                    valueStr = "One";
                    break;
                case 2:
                    valueStr = "Two";
                    break;
                case 3:
                    valueStr = "Three";
                    break;
                case 4:
                    valueStr = "Four";
                    break;
                case 5:
                    valueStr = "Five";
                    break;
                case 6:
                    valueStr = "Six";
                    break;
                case 7:
                    valueStr = "Seven";
                    break;
                case 8:
                    valueStr = "Eight";
                    break;
                case 9:
                    valueStr = "Nine";
                    break;
                default:
                    valueStr = "Other";
                    break;
            }

            if (x == 0) {
                break;
            }
            System.out.println("Your number is '" + valueStr + "'");
        }
    }


}

