/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampleexercises.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kedk
 */
public class ReverseAList {

    public List<Integer> reverse(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (int i = input.size() - 1; i >= 0; i--) {
            result.add(input.get(i));
        }
        return result;
    }

    public void reverseAnArray(Integer[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            int tmp = input[left];
            input[left] = input[right];
            input[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseAList rList = new ReverseAList();
        //List<Integer> result = rList.reverse(Arrays.asList(1, 2, 3, 4));
        Integer[] array = new Integer[]{1, 2, 3, 4};
        rList.reverseAnArray(array);
        System.out.println(Arrays.toString(array));
    }
}
