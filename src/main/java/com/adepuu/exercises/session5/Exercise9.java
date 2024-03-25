package com.adepuu.exercises.session5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    public static void main(String[] args) {
        //case 7 get the number of days you have to wait after the i-th day to get a warmer temperature
        System.out.println();
        int temperatures[] = {73,74,75,71,69,72,76,73};

        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();

        for (int t = 0; t < n; ++t) {
            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[t]) {
                int f = stk.pop();
                ans[f] = t - f;
            }
            stk.push(t);
        }

        for (int t = 0; t < n; ++t) {
            System.out.print(ans[t] + " ");
        }

    }
}
