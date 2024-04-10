package com.santhosh.dsa.array.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void checkInput1() {
        assertFalse(ContainsDuplicate.solve(new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    void checkInput2() {
        assertTrue(ContainsDuplicate.solve(new int[]{1, 2, 3, 4, 5, 1}));
    }
}