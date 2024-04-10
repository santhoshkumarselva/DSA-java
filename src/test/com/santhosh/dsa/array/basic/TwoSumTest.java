package com.santhosh.dsa.array.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void checkInput1() {
        assertNull(TwoSum.solve(new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    void checkInput2() {
        assertArrayEquals(TwoSum.solve(new int[]{1, 2, 3, 4, 5, 1}), new int[]{0, 5});
    }
}