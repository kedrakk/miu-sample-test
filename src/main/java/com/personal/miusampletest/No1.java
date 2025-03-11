/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampletest;

/**
 *
 * @author kedk
 */
public class No1 {

    public int checkIfCenter(int[] nums) {
        if (nums.length == 0 || nums.length % 2 == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        } else {
            int midIndex = nums.length / 2;

            int midItem = nums[midIndex];

            int startIndex = 0;
            int endIndex = nums.length - 1;
            while (startIndex < midIndex && endIndex > midIndex) {
                if (nums[startIndex] <= midItem || nums[endIndex] <= midItem) {
                    return 0;
                }
                startIndex++;
                endIndex--;
            }
            return 1;
        }
    }
}
