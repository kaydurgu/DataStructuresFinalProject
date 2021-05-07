package com.company;

public class Fenwick{
    int []bit_arr = new int[10000];
    Fenwick(int []arr){
        for (int i = 1;i<=arr.length ;i ++){
            bit_arr[i] = 0;
        }
        for(int i = 0;i < arr.length ;i ++){
            update(arr.length , i + 1 , arr[i]);
        }
    }
    public int sum(int i){
        int sum = 0;
        while (i>0){
            sum+=bit_arr[i];
            i = i - (i & (-i));
        }
        return sum;
    }
    public void update(int len , int i , int data){
        while (i<=len){
            bit_arr[i]+=data;
            i = i + (i & (-i));
        }
    }
}