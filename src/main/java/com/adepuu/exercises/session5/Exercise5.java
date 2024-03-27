package com.adepuu.exercises.session5;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = "asc"
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = "desc"
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {

        //case 3.2 Ascending num

        int ascTarget[] = {9, 8, 7, 9, 8, 1, 2};
        int i, j, temp;

        System.out.println("Case 3.2 the result of ascending short is: ");
        for (i = 0; i < ascTarget.length; i++) {
            for (j = ascTarget.length - 1; j > i; j--) {
                if (ascTarget[j] < ascTarget[j - 1]) {
                    temp = ascTarget[j];
                    ascTarget[j] = ascTarget[j - 1];
                    ascTarget[j - 1] = temp;
                }
            }
        }
        for (i = 0; i < ascTarget.length; i++) {
            System.out.print(ascTarget[i] + ",");
        }

        //case 3.3 Descending num

        int descTarget[] = {9, 8, 7, 9, 8, 1, 2};
        int k, l, temp2;
        System.out.println();
        System.out.println("Case 3.3 the result of descending short is: ");

        for (i = 0; i < descTarget.length; i++) {
            for (j = descTarget.length - 1; j > i; j--) {
                if (descTarget[j] > descTarget[j - 1]) {
                    temp2 = descTarget[j];
                    descTarget[j] = descTarget[j - 1];
                    descTarget[j - 1] = temp2;
                }
            }
        }
        for (i = 0; i < descTarget.length; i++) {
            System.out.print(descTarget[i] + ",");

        }



    }
}
