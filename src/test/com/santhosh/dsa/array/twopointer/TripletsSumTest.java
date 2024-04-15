package com.santhosh.dsa.array.twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripletsSumTest {
    @Test
    void Input1() {
        assertEquals(TripletsSum.findTriplets(new int[]{1, 5, 3, 2}), 2);
    }
    @Test
    void Input2() {
        assertEquals(TripletsSum.findTriplets(new int[]{3, 2, 7}), 0);
    }
}