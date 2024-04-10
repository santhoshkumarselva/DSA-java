package com.santhosh.dsa.array.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void checkInput1() {
        assertEquals(TrappingRainWater.solve(new int[]{2, 0, 2}), 2);
    }
    @Test
    void checkInput2() {
        assertEquals(TrappingRainWater.solve(new int[]{3, 0, 2, 0, 4}), 7);
    }
    @Test
    void checkInput3() {
        assertEquals(TrappingRainWater.solve(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
    }
}