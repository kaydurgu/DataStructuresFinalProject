package com.company;

public class ternarySearch {
    public static int find(int arr[],int n)
    {
        int l = 0;
        int r = arr.length-1;
        while (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (arr[mid1] == n) {
                return mid1;
            }
            if (arr[mid2] == n) {
                return mid2;
            }
            if (n < arr[mid1]) { r = mid1 - 1;}
            else if (n > arr[mid2]) {l = mid2 + 1; }
            else {
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
        return -1;
    }
}
