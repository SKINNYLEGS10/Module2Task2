package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int pie[] = {2, 4, 5, 20, 1, 12};
        int k = 3;
        int smallest = pie[k - 1];
        System.out.println(smallest);
        int order[] = new int[]{1, 2, 1, 0, 2};
        Arrays.sort(order);
        System.out.printf(Arrays.toString(order));
        int mat1[][] = {{2, 2}, {2, 3}};
        int mat2[][] = {{3, 1}, {2, 2}};
        int[][] times = new int[2][2];
        int p, q;
        for (p = 0; p < mat1.length; p++) {
            for (q = 0; q < mat2.length; q++) {
                System.out.println("p" + p);
                System.out.println("q" + q);
                times[p][q] = mat1[p][q] * mat2[p][q];
                System.out.println(times[p][q]);
            }
        }
    }
}

