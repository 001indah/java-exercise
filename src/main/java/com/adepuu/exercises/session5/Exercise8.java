package com.adepuu.exercises.session5;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        //case 6 Java String Program to Find all Duplicates on Array
        int findDuplicateTarget[] = {4,3,2,7,8,2,3,1}, x,y;
        System.out.println();
        System.out.println("Case 6.0. Duplicate element is: ");

        for (x = 0; x < findDuplicateTarget.length-1; x++) {
            for (y = x + 1; y < findDuplicateTarget.length; y++) {
                if ((findDuplicateTarget[x]) == (findDuplicateTarget[y]) && (x != y)) {
                    System.out.print(findDuplicateTarget[y]+", ");
                }
            }
        }

    }
}
