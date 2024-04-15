package com.santhosh.dsa.backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniquePermutationTest {

    @Test
    void checkInput1() {
        assertArrayEquals(Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA").toArray(), UniquePermutation.findUniquePermutation("ABC").toArray());
    }

    @Test
    void checkInput2() {
        assertArrayEquals(Arrays.asList("AB", "BA").toArray(), UniquePermutation.findUniquePermutation("AB").toArray());
    }

    @Test
    void checkInput3() {
        assertArrayEquals(List.of("AA").toArray(), UniquePermutation.findUniquePermutation("AA").toArray());
    }

    @Test
    void checkInput4() {
        assertArrayEquals(List.of("AAB", "ABA", "BAA").toArray(), UniquePermutation.findUniquePermutation("ABA").toArray());
    }

    @Test
    void checkInput5() {
        assertArrayEquals(List.of("AABC", "AACB", "ABAC", "ABCA", "ACAB", "ACBA", "BAAC", "BACA", "BCAA", "CAAB", "CABA", "CBAA").toArray(), UniquePermutation.findUniquePermutation("ABCA").toArray());
    }
}