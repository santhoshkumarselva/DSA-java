package com.santhosh.dsa.backtracking;

/*Given a string S.
The task is to print all unique permutations of the given string that may contain
duplicates in lexicographically sorted order.*/

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static List<List<String>> findPalindromePartitioning(String input) {
        List<List<String>> solution = new ArrayList<>();
        List<String> currentSolution = new ArrayList<>();
        findSolutionUtils(input, 0, currentSolution, solution);
        return solution;
    }

    private static void findSolutionUtils(String input, int pos, List<String> currentSolution, List<List<String>> solution) {
        if(pos==input.length()) {
            solution.add(new ArrayList<>(currentSolution));
        } else {
            for(int i = pos; i<input.length(); i++) {
                if(isPalindrome(input, pos, i)) {
                    String subString = input.substring(pos, i+1);
                    currentSolution.add(subString);
                    findSolutionUtils(input, i+1, currentSolution, solution);
                    currentSolution.remove(subString);
                }
            }
        }
    }

    private static boolean isPalindrome(String input, int pos, int i) {
        if(pos > i) return true;
        if(input.charAt(pos) == input.charAt(i)) {
            return isPalindrome(input, pos+1, i-1);
        } else return false;
    }
}
