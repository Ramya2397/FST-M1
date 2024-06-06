package org.example;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args) {

        int[] arrNum = {10, 7, 13, 54, 11, 15};
        insertionsort(arrNum);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(arrNum));

    }

    public static void insertionsort(int array[]) {

        int size = array.length, i;

        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
}
