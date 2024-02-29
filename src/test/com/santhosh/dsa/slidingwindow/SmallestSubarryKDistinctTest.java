package com.santhosh.dsa.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestSubarryKDistinctTest {

    @Test
    void testCase1() {
        SmallestSubarryKDistinct obj = new SmallestSubarryKDistinct();
        int[] arr = new int[] { 1, 1, 2, 2, 3, 3, 4, 5};
        Assertions.assertEquals(3, obj.solve(arr, 3));
    }

    @Test
    void testCase2() {
        SmallestSubarryKDistinct obj = new SmallestSubarryKDistinct();
        int[] arr = new int[] { 11, 12, 12, 13};
        Assertions.assertEquals(4, obj.solve(arr, 3));
    }

    @Test
    void testCase3() {
        SmallestSubarryKDistinct obj = new SmallestSubarryKDistinct();
        int[] arr = new int[] { 11, 12, 12, 12, 13, 13};
        Assertions.assertEquals(-1, obj.solve(arr, 5));
    }
}