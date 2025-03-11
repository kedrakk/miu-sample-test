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
public class No6Test {

    No6 instance = new No6();

    @Test
    public void testGetPOECase1() {
        int[] nums = {1, 8, 3, 7, 10, 2};
        int expResult = 3;
        int result = instance.getPOE(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPOECase2() {
        int[] nums = {1, 5, 3, 1, 1, 1, 1, 1, 1};
        int expResult = 2;
        int result = instance.getPOE(nums);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPOECase3() {
        int[] nums = {2, 1, 1, 1, 2, 1, 7};
        int expResult = 5;
        int result = instance.getPOE(nums);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPOECase4() {
        int[] nums = {1, 2, 3};
        int expResult = -1;
        int result = instance.getPOE(nums);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPOECase5() {
        int[] nums = {3, 4, 5, 10};
        int expResult = -1;
        int result = instance.getPOE(nums);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPOECase6() {
        int[] nums = {1, 2, 10, 3, 4};
        int expResult = -1;
        int result = instance.getPOE(nums);
        assertEquals(expResult, result);
    }

}
