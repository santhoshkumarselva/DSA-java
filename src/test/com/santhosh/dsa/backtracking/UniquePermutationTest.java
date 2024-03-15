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
        assertEquals(result.size(), expected.size());
        assertTrue(result.containsAll(expected));
    }
}