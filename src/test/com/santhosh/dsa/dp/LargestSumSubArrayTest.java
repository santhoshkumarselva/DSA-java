package com.santhosh.dsa.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSumSubArrayTest {
    @Test
    void inputTest1() {
        int arr[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        assertEquals(7, LargestSumSubArray.solve(arr));
    }
    @Test
    void inputTest2() {
        int arr[] = new int[]{1, -2, 3, -1, 2};
        assertEquals(4, LargestSumSubArray.solve(arr));
    }
}