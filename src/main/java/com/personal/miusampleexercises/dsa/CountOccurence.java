/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampleexercises.dsa;

/**
 *
 * @author kedk
 */
public class CountOccurence {

    static Integer countStrOccurence(String str, char ch) {
        Integer count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count:" + countStrOccurence("hello world", 'o'));
        System.out.println("Count:" + countStrOccurence("Programming", 'r'));
    }
}
