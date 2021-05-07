package com.company;

public class binarySearch {
    public static int find(int arr[], int n) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            // if the middle element is our goal element, return its index
            if (arr[mid] == n) {
                return mid;// stop if the middle element is equal to searching element
            }
            // if the middle element is smaller
            // point our index to the mid+1, taking the first half
            else if (arr[mid] < n)
                left = mid + 1;
                // if the middle element is bigger
                // point our index to the mid-1, taking the second half
            else if (arr[mid] > n)
                right = mid - 1;
        }
        return -1;
    }
}
