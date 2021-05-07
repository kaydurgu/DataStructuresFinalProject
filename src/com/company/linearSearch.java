package com.company;

public class linearSearch {
    public static int find(int arr[], int n) {
        // going through a whole array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) // if you fund a number the linearSearch Function returns the index of number in array
                return i;
        }// otherwise it returns
        return -1;
    }
}
