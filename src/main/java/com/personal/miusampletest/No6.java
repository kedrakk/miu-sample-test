package com.personal.miusampletest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kedk
 */
public class No6 {

    public int getPOE(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        int leftSum = 0, rightSum = 0;

        while (startIndex <= endIndex) {
            if (leftSum == 0 && rightSum == 0) {
                rightSum += nums[endIndex];
                leftSum += nums[startIndex];
                startIndex++;
                endIndex--;
            } else if (leftSum == rightSum && startIndex == endIndex) {
                return startIndex;
            } else if (leftSum > rightSum) {
                rightSum += nums[endIndex];
                endIndex--;
            } else {
                leftSum += nums[startIndex];
                startIndex++;
            }
        }

        return -1;
    }
}
