package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void test(){
        ArraySum arraySum = new ArraySum();
        int[] arr = {1,2,3,4,5};
        int actualSum = arraySum.getSum(arr);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSum);
    }
    @Test
    public void testNegative(){
        ArraySum arraySum = new ArraySum();
        int[] arr = {-1,-2,-3,-4,-5};
        int actualSum = arraySum.getSum(arr);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSum);
    }
}