package com.bootcoding.junit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
    @Test
    public void testMax(){
        ArraySum arraySum = new ArraySum();
        int[] arr = {1,2,3,4,5};
        int actualSum = arraySum.getMax(arr);
        int expectedSum = 5;
        assertEquals(expectedSum,actualSum);
    }
    @Test
    public void testEven(){
        ArraySum arraySum = new ArraySum();
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> ansList = arraySum.getEven(arr);
        assertEquals(ansList, Arrays.asList(2,4));
    }
}