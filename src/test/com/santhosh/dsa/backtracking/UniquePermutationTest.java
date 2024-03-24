package com.santhosh.dsa.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniquePermutationTest {

    @Test
    void checkInput1() {
        UniquePermutation obj = new UniquePermutation();
        String input = "ABC";
        List<String> result = obj.findUniquePermutation(input);
        List<String> expected = List.of("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void chekInput2() {
        UniquePermutation obj = new UniquePermutation();
        String input = "AB";
        List<String> result = obj.findUniquePermutation(input);
        List<String> expected = List.of("AB", "BA");
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void chekInput3() {
        UniquePermutation obj = new UniquePermutation();
        String input = "AA";
        List<String> result = obj.findUniquePermutation(input);
        List<String> expected = List.of("AA");
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void chekInput4() {
        UniquePermutation obj = new UniquePermutation();
        String input = "ABA";
        List<String> result = obj.findUniquePermutation(input);
        List<String> expected = List.of("ABA", "AAB", "BAA");
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void chekInput5() {
        UniquePermutation obj = new UniquePermutation();
        String input = "ABCA";
        List<String> result = obj.findUniquePermutation(input);
        List<String> expected = List.of("AABC", "AACB", "ABAC", "ABCA", "ACBA", "ACAB", "BAAC", "BACA",
                "BCAA", "CABA", "CAAB", "CBAA");
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }
}