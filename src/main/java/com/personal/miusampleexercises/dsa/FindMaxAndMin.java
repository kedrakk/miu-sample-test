/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampleexercises.dsa;

/**
 *
 * @author kedk
 */
public class FindMaxAndMin {

    Integer findMax(Integer[] input) {
        Integer max = input[0];
        for (int i = 0; i < input.length; i++) {
            max = Math.max(max, input[i]);
        }
        return max;
    }

    Integer findMin(Integer[] input) {
        Integer min = input[0];
        for (int i = 0; i < input.length; i++) {
            min = Math.min(min, input[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        FindMaxAndMin find = new FindMaxAndMin();
        Integer[] array = new Integer[]{4, 2, 7, 1, 9};
        Integer[] array1 = new Integer[]{-10, -3, 0, 5, 8};
        System.out.println("Max:" + find.findMax(array) + " and min:" + find.findMin(array));
        System.out.println("Max:" + find.findMax(array1) + " and min:" + find.findMin(array1));
    }
}
