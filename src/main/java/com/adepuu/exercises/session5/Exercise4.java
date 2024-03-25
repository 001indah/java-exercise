package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        //case 3.1 remove duplicate num

        int targetRemoveNum[] = {1, 2, 3, 6, 8, 3, 4, 8, 9};

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : targetRemoveNum) {
            list.add(num);
        }

        HashSet<Integer> set = new HashSet<>();
        set.addAll(list); // Change ArrayList to HashSet, save new element
        list.clear(); // Blank ArrayList
        list.addAll(set); // add new element to ArrayList
        System.out.println("case 3.1 the result of duplicate num has removed is: "+ list);

    }
}
