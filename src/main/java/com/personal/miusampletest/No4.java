/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampletest;

/**
 *
 * @author kedk
 */
public class No4 {

    public int reverseNum(int num) {
        if (num > -10 && num < 10) {
            return num;
        } else {
            int result = 0;
            while (num != 0) {
                int lastDigit = num % 10;
                if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                    return 0;
                }
                result = result * 10 + lastDigit;
                num /= 10;
            }
            return result;
        }
    }
}
