package com.santhosh.dsa.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    @Test
    void input1() {
        assertArrayEquals(PalindromePartitioning.findPalindromePartitioning("nitin").toArray(), new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<>(Arrays.asList("n", "i", "t", "i", "n")));
            add(new ArrayList<>(Arrays.asList("n", "iti", "n")));
            add(new ArrayList<>(List.of("nitin")));
        }}.toArray());
    }

}