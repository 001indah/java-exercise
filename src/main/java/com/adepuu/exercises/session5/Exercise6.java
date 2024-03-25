package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {

        //case 4 remove all occurrence an element in an array

        int elementTarget[] = {1, 2, 1, 3, 5, 1};
        System.out.println();
        System.out.println("case 4. Remove all occurrence an element in an array result: ");

        HashSet<Integer> newSet = new HashSet<>();
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (int num : elementTarget) {
            if (!newSet.contains(num)) {
                uniqueElements.add(num);
                newSet.add(num);
            }
        }

        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }


    }
}
