/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rango method, of class Operaciones.
     */
    @Test
    @Ignore
    public void testRango() {
        System.out.println("rango");
        
        Operaciones instance = new Operaciones();
        
        int a = 1;
        int b = 5;
        int[] result = instance.rango(a, b);
        
        int[] expResult = {1,2,3,4,5};
        
        assertArrayEquals(expResult, result);
       
        
    }
    @Test
    public void testRango2(){
        System.out.println("rango");
        
        Operaciones instance = new Operaciones();
        
        int a = 5;
        int b = 1;
        int[] result = instance.rango(a, b);
        
        int[] expResult = {1,2,3,4,5};
        
        assertArrayEquals(expResult, result);
        
        
    }

    /**
     * Test of sumRango method, of class Operaciones.
     */
    @Test
    @Ignore
    public void testSumRango() {
        System.out.println("sumRango");
        int a = 0;
        int b = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.sumRango(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPar method, of class Operaciones.
     */
    @Test
    @Ignore
    public void testIsPar() {
        System.out.println("isPar");
        int a = 0;
        Operaciones instance = new Operaciones();
        boolean expResult = false;
        boolean result = instance.isPar(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Test
    @Ignore
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        int[] nums = null;
        Operaciones instance = new Operaciones();
        int[] expResult = null;
        int[] result = instance.extraerPositivos(nums);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
