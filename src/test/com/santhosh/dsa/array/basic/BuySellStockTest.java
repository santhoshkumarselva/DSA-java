package com.santhosh.dsa.array.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStockTest {
    @Test
    void checkInput1() {
        assertEquals(BuySellStock.solve(new int[]{100, 180, 260, 310, 40, 535, 695}), 655);
    }
}