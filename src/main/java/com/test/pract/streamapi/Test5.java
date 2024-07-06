package com.test.pract.streamapi;

public class Test5 {

    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 0, 4, 5, 0};

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == 0) {
                for (int j = a.length - 1; j >i; j--) {
                    a[j] = a[j - 1];
                }
                i++;
            }
        }

        for (int j : a) {
            System.out.print(j+",");
        }
    }
}
