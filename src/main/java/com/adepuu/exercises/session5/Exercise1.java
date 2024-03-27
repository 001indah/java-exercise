//package com.adepuu.exercises.session5;
//
//public class Exercise1 {
//
//    public static void main(String[] args) {
//        //case 1.1 looking for the largest num
//        int[] target = {1, 3, 4, 5, 6, 7};
//        int largest = target[0];
//
//        for (int i = 1; i < target.length; i++) {
//            if (target[i] > largest) {
//                largest = target[i];
//            }
//        }
//
//        System.out.println("Case 1.1. the largest num is: "+ largest);
//
//    public int getHighestNumber(int[] input) {
//        if (input.length == 0) return 0;
//
//        int max = input[0]; // Initialize max with the first element of the array
//
//        for (int i = 1; i < input.length; i++) { // Start from the second element
//            if (input[i] > max) {
//                max = input[i]; // Update max if the current element is larger
//            }
//        }
//        return max;
//
//    }
//}
