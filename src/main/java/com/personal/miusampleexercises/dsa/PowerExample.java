/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampleexercises.dsa;

/**
 *
 * @author kedk
 */
public class PowerExample {

    Integer powerOfNum(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        boolean isNegative = pow < 0;
        int result = 1;
        for (int i = 0; i < Math.abs(pow); i++) {
            result *= num;
        }
        if (isNegative) {
            return 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        PowerExample power = new PowerExample();
        System.out.println("2^3 = " + power.powerOfNum(2, 3));  // 8
        System.out.println("5^-2 = " + power.powerOfNum(5, -2));  // 0 (integer division)
        System.out.println("0^5 = " + power.powerOfNum(0, 5));  // 0
        System.out.println("3^0 = " + power.powerOfNum(3, 0));  // 1
    }
}
