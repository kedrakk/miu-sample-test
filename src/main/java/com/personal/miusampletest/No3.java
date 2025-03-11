/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampletest;

/**
 *
 * @author kedk
 */
public class No3 {

    public char[] charSubArray(char[] arr, int startIndex, int length) {
        if (arr == null || arr.length == 0 || startIndex > arr.length || length > arr.length || length + startIndex > arr.length || startIndex < 0 || length < 0) {
            return null;
        } else {
            char[] result = new char[length];
            System.arraycopy(arr, startIndex, result, 0, length);
            return result;
        }
    }
}
