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
public class No4Test {
    No4 instance = new No4();
    
    @Test
    public void testReverseNumCase1() {
        int num = 1;
        int expResult = 1;
        int result = instance.reverseNum(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReverseNumCase2() {
        int num = 0;
        int expResult = 0;
        int result = instance.reverseNum(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReverseNumCase3() {
        int num = 1234;
        int expResult = 4321;
        int result = instance.reverseNum(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReverseNumCase4() {
        int num = 12005;
        int expResult = 50021;
        int result = instance.reverseNum(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReverseNumCase5() {
        int num = 1000;
        int expResult = 1;
        int result = instance.reverseNum(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReverseNumCase6() {
        int num = -12345;
        int expResult = -54321;
        int result = instance.reverseNum(num);
        assertEquals(expResult, result);
    }
    
}
