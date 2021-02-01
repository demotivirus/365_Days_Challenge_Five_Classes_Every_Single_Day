package com.demotivirus.Day_042;

public class DoubleFor {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0, k = 0; i < arr.length && k < arr.length; i++, k++) {
            arr[i][k] = i + k;
            System.out.println(arr[i][k]);
        }
    }
}
