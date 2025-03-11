/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampletest;

import java.util.Arrays;

/**
 *
 * @author kedk
 */
public class No5 {

    public int[] distinctArr(int[] a, int[] b) {
        if (a == null || b == null) {
            return null;
        } else if (a.length == 0 || b.length == 0) {
            return new int[0];
        } else {
            int minLength = Math.min(a.length, b.length);
            int[] tmpChk = new int[minLength];
            int count = 0;
            int[] first = a, second = b;
            if (b.length < a.length) {
                first = b;
                second = a;
            }
            for (int i = 0; i < first.length; i++) {
                for (int j = 0; j < second.length; j++) {
                    if (first[i] == second[j]) {
                        tmpChk[count] = first[i];
                        count++;
                    }
                }
            }

            int[] result = new int[count];
            for (int i = 0; i < count; i++) {
                result[i] = tmpChk[i];
            }
            return result;
        }
    }
}
