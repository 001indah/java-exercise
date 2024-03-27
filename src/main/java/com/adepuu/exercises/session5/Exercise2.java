package com.adepuu.exercises.session5;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {

        //case 1.2 array program for array rotation

        int[] arrRotationTarget = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        System.out.println("Case 1.2. the rotate num is: ");

        int[] newRotate = new int[arrRotationTarget.length]; // initiate new array

        for (int i = d; i < arrRotationTarget.length; i++) {  // moves shifted element to new arr
            newRotate[i - d] = arrRotationTarget[i];
        }
        for (int i = 0; i < d; i++) { // Moves the unshifted elements to a new array
            newRotate[arrRotationTarget.length - d + i] = arrRotationTarget[i];
        }
        for (int i = 0; i < newRotate.length; i++) {
            System.out.print(newRotate[i] + " ");
        }
        System.out.println();

    }
}
