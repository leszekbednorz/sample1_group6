package pl.coderstrust.group6.java.sample1.sorts;

import java.io.Serializable;

public class BubbleSort implements Serializable {

    public static void main(String args[]) {

        int[] a = {8, 4, 2, 7, 4, 3, 7, 8};
        performSort(a);
        showArray(a);

    }

    private static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    private static void performSort(int[] a) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < (a.length - 1); i++) {
                if (a[i] > a[i + 1]) {
                    changeOrder(a, i);
                    changed = true;
                }
            }
        }
    }

    private static void changeOrder(int[] a, int i) {
        int tmp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = tmp;
    }
}
