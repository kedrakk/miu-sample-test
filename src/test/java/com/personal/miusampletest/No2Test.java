package com.personal.miusampletest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class No2Test {

    No2 instance = new No2();

    @Test
    public void testEvenOddSumCase1() {
        int[] nums = {1};
        int expResult = 1;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase2() {
        int[] nums = {1, 2};
        int expResult = -1;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase3() {
        int[] nums = {1, 2, 3};
        int expResult = 2;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase4() {
        int[] nums = {1, 2, 3, 4};
        int expResult = -2;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase5() {
        int[] nums = {3, 3, 4, 4};
        int expResult = -2;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase6() {
        int[] nums = {3, 2, 3, 4};
        int expResult = 0;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase7() {
        int[] nums = {4, 1, 2, 3};
        int expResult = -2;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase8() {
        int[] nums = {1, 1};
        int expResult = 2;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testEvenOddSumCase9() {
        int[] nums = {};
        int expResult = 0;
        int result = instance.evenOddSum(nums);
        assertEquals(expResult, result);
    }

}
