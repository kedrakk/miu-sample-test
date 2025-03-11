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
public class No5Test {

    No5 instance = new No5();

    @Test
    public void testDistinctArrCase1() {
        int[] first = null;
        int[] second = null;
        int[] expResult = null;
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testDistinctArrCase2() {
        int[] first = null;
        int[] second = {};
        int[] expResult = null;
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testDistinctArrCase3() {
        int[] first = {1, 2};
        int[] second = null;
        int[] expResult = null;
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testDistinctArrCase4() {
        int[] first = {1, 2};
        int[] second = {};
        int[] expResult = {};
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testDistinctArrCase5() {
        int[] first = {};
        int[] second = {1, 2, 3};
        int[] expResult = {};
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testDistinctArrCase6() {
        int[] first = {1, 8, 3, 2};
        int[] second = {4, 2, 6, 1};
        int[] expResult = {1, 2};
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testDistinctArrCase7() {
        int[] first = {1, 8, 3, 2, 6};
        int[] second = {2, 6, 1};
        int[] expResult = {2, 6, 1};
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testDistinctArrCase8() {
        int[] first = {1, 3, 7, 9};
        int[] second = {7, 1, 9, 3};
        int[] expResult = {1, 3, 7, 9};
        int[] result = instance.distinctArr(first, second);
        assertArrayEquals(expResult, result);
    }

}
