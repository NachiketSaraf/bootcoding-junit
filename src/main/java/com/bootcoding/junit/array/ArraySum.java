package com.bootcoding.junit.array;

public class ArraySum {
    public int getSum(int[] num){
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
}
