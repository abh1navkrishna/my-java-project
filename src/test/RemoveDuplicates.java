package test;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 4, 3, 5, 8, 6, 7, 4, 5, 7, 8, 8, 8, 6, 4, 2, 2, 4, 5, 34 };
        HashSet<Integer> r = new HashSet<>();

        for (Integer n : nums) {
            r.add(n);
        }
        System.out.println("-------" + r);
    }
}
