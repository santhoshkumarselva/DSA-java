package com.santhosh.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GenerateSubsets {
    static void generateSubsets(int[] nums) {
        List<Integer> subSet = new ArrayList<>();
        generateSubsetsHelper(nums, 0, subSet);
    }

    private static void generateSubsetsHelper(int[] nums, int k, List<Integer> subSet) {
        if(k == nums.length) printSubset(subSet);
        else {
            subSet.add(nums[k]);
            generateSubsetsHelper(nums, k+1, subSet);
            subSet.remove(subSet.size() - 1);
            generateSubsetsHelper(nums, k+1, subSet);
        }
    }

    private static void printSubset(List<Integer> subSet) {
        System.out.print("\n{");
        for(Integer i: subSet) {
            System.out.print(" " + i + ",");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3};
        generateSubsets(input);
    }
}
