package com.santhosh.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {
    public static List<List<Integer>> generateAllPermutations(int[] input) {
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> currentPermutations = new ArrayList<>();
        boolean[] visited = new boolean[input.length];
        generateAllPermutationsHelper(input, visited, currentPermutations, permutations);
        return permutations;
    }
    private static void generateAllPermutationsHelper(int[] input, boolean[] visited, List<Integer> currentPermutations, List<List<Integer>> permutations) {
        if(currentPermutations.size() == input.length) permutations.add(new ArrayList<Integer>(currentPermutations));
        else {
            for(int i=0; i<input.length; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    currentPermutations.add(input[i]);
                    generateAllPermutationsHelper(input, visited, currentPermutations, permutations);
                    currentPermutations.removeLast();
                    visited[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3};
        System.out.println(generateAllPermutations(input));
    }
}
