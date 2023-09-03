package com.bootcoding.junit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayOperationsTest {
    @Test
    public void test(){
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arr = {1,2,3,4,5};
        int actualSum = ArrayOperations.getSum(arr);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSum);
    }
    @Test
    public void testNegative(){
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arr = {-1,-2,-3,-4,-5};
        int actualSum = ArrayOperations.getSum(arr);
        int expectedSum = 15;
        assertEquals(expectedSum,actualSum);
    }
    @Test
    public void testMax(){
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arr = {1,2,3,4,5};
        int actualSum = ArrayOperations.getMax(arr);
        int expectedSum = 5;
        assertEquals(expectedSum,actualSum);
    }
    @Test
    public void testEven(){
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> ansList = ArrayOperations.getEven(arr);
        assertEquals(ansList, Arrays.asList(2,4));
    }
}