package com.bootcoding.junit.array;

import java.util.ArrayList;

public class ArrayOperations {

    public static int getSum(int[] num){
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
    public static int getMax(int[] num){
        int max = Integer.MIN_VALUE;
        for (int n :num) {
            max=  Math.max(n,max);
        }
        return max;
    }
    public static ArrayList<Integer> getEven(int[] num){
        ArrayList<Integer> even = new ArrayList<>();
        for (int n :num) {
            if (n%2==0) even.add(n);
        }
        return even ;
    }


}
