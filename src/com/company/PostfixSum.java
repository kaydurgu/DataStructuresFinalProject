package com.company;

public class PostfixSum {
    int[] PostFix = new int[100000];
    public void buildPostfix(int arr[]){
        PostFix[0] = arr[0];
        for (int i = 1 ;i < arr.length-1; i++){
            PostFix[i] = arr[i] + PostFix[i-1];
        }
    }
    public int find( int l ,int r) {
      return PostFix[r]- PostFix[l- 1];
    }
}
