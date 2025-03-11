/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.personal.miusampletest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class No1Test {

    No1 instance = new No1();

    //@Test
    public void testCheckIfCenterEmptyCase() {
        int[] nums = {};
        int expResult = 0;
        int result = instance.checkIfCenter(nums);
        assertEquals(expResult, result);
    }

    //@Test
    public void testCheckIfCenterLengthOneCase() {
        int[] nums = {10};
        int expResult = 1;
        int result = instance.checkIfCenter(nums);
        assertEquals(expResult, result);
    }

    //@Test
    public void testCheckIfCenterLengthEvenCase() {
        int[] nums = {1, 2, 3, 4};
        int expResult = 0;
        int result = instance.checkIfCenter(nums);
        assertEquals(expResult, result);
    }

    //@Test
    public void testCheckIfCenterCorrectCase() {
        int[] nums = {3, 2, 1, 4, 5};
        int expResult = 1;
        int result = instance.checkIfCenter(nums);
        assertEquals(expResult, result);
    }

    //@Test
    public void testCheckIfCenterWrongCase1() {
        int[] nums = {1, 2, 3, 4, 5};
        int expResult = 0;
        int result = instance.checkIfCenter(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckIfCenterWrongCase2() {
        int[] nums = {3, 2, 1, 4, 1};
        int expResult = 0;
        int result = instance.checkIfCenter(nums);
        assertEquals(expResult, result);
    }

}
