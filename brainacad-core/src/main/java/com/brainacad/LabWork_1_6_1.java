package com.brainacad;

import java.util.Arrays;

/**
 * Created by korban on 15.10.2016.
 */
public class LabWork_1_6_1 {
    public static void main(String[] args) {
        final int SIZE = 525;
        int[] a = new int[SIZE/2];
        int k = 0;
        for (int i = 2; i <= 30; i += 2, k++) {
          a [k] = i;
        }

        System.out.println(Arrays.toString(a));

    }
}
