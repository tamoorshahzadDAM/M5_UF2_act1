/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class pruebas {
    private static MyUtils myutils;
    
    public pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        myutils = new MyUtils();
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

    //Prueba de invertir
    @Test
    public final void  testInverteixString() {
    
        assertEquals("aloh", MyUtils.inverteix("hola"));
    }
    
    @Test
    public final void  testInverteixNull() {
    
        assertEquals("", MyUtils.inverteix(""));
    }
 
    //Prueba de Edat
    
    @Test
    public final void  testedatCumple() {
    
        assertEquals(21, MyUtils.edat(01, 06, 1995),0);
    }
    
    @Test
    public final void  testedatNoCumple1() {
    
        assertEquals(-1, MyUtils.edat(11, 10, 1800),0);
    }
    
    @Test
    public final void  testedatNoCumple2() {
    
        assertEquals(-2, MyUtils.edat(29, 2, 1995),0);
    }
    
    @Test
    public final void  testedatNoCumple3() {
    
        assertEquals(-2, MyUtils.edat(01, 15, 1995),0);
    }
   
    
    //prueba de clase factorial.
    @Test
    public final void testfactorial(){
        
        assertEquals(120, MyUtils.factorial(5),0);
    }
    
    @Test
    public final void testfactorial2(){
        
        assertEquals(-1, MyUtils.factorial(-10),0);
    }
    
    @Test
    public final void testfactorial3(){
        
        assertEquals(1, MyUtils.factorial(0),0);
    }
    
    @Test
    public final void testfactorial4(){
        
        assertEquals(-1, MyUtils.factorial(1000),0);
    }
    
}
