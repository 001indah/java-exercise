
package com.adepuu.exercises.session5;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {

//case 2 check duplicate num

        int duplicateNumCheck[] = {1,1,1,3,3,4,3,2,4,2};
        int targetCheck = duplicateNumCheck[0];

        boolean result = false;

        for (int i = 1; i < duplicateNumCheck.length; i++) {
            if (duplicateNumCheck[i] == targetCheck) {
                result = true;
                break;
            }
        }
        System.out.println();
        System.out.println("case 2.0. is there are duplicate num? " + result);

    }
}
