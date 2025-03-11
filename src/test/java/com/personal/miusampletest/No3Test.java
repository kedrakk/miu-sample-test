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
public class No3Test {

    No3 instance = new No3();

    @Test
    public void testCharSubArrayCase1() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 0;
        int length = 4;
        char[] expResult = null;
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase2() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 0;
        int length = 3;
        char[] expResult = {'a', 'b', 'c'};
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase3() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 0;
        int length = 2;
        char[] expResult = {'a', 'b'};
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase4() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 0;
        int length = 1;
        char[] expResult = {'a'};
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase5() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 1;
        int length = 3;
        char[] expResult = null;
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase6() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 1;
        int length = 2;
        char[] expResult = {'b', 'c'};
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase7() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 1;
        int length = 1;
        char[] expResult = {'b'};
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase8() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 2;
        int length = 2;
        char[] expResult = null;
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase9() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 2;
        int length = 1;
        char[] expResult = {'c'};
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase10() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 3;
        int length = 1;
        char[] expResult = null;
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase11() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = 1;
        int length = 0;
        char[] expResult = {};
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase12() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = -1;
        int length = 2;
        char[] expResult = null;
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase13() {
        char[] arr = {'a', 'b', 'c'};
        int startIndex = -1;
        int length = -2;
        char[] expResult = null;
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCharSubArrayCase14() {
        char[] arr = {};
        int startIndex = 0;
        int length = 1;
        char[] expResult = null;
        char[] result = instance.charSubArray(arr, startIndex, length);
        assertArrayEquals(expResult, result);
    }

}
