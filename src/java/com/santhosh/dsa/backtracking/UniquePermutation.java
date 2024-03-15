package com.santhosh.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class UniquePermutation {
    List<String> findUniquePermutation(String s) {
        List<String> result = new ArrayList<>();
        UniquePermutationUtil(s, "", result);
        return result;
    }

    private void UniquePermutationUtil(String s, String currentSolution, List<String> result) {
        if(s.length() == 0) {
            result.add(currentSolution);
        }
        else {
            boolean[] ascii = new boolean[256];
            for(int i=0; i<s.length(); i++) {
                if(ascii[s.charAt(i)] == true) continue;
                ascii[s.charAt(i)] = true;
                UniquePermutationUtil(s.substring(0, i)+s.substring(i+1), currentSolution+s.charAt(i), result);
                ascii[s.charAt(i)] = false;
            }
        }
    }

    public static void main(String[] args) {
        UniquePermutation obj = new UniquePermutation();
        String input = "ABC";
        List<String> result = obj.findUniquePermutation(input);
        System.out.println(result);
    }
}
