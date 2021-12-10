/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 18K59LA
 */
public class ComandoPalabrasTest {
    
    public ComandoPalabrasTest() {
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
     * Test of esComando method, of class ComandoPalabras.
     */
    @Test
    public void testEsComando() {
        String comando1 = "ir";
        String comando2 = "ayuda";
        String comando3 = "salir";
        
        ComandoPalabras instance = new ComandoPalabras();
        boolean expResult = true;
        boolean result1 = instance.esComando(comando1);
         boolean result2 = instance.esComando(comando2);
          boolean result3 = instance.esComando(comando3);
        assertEquals(expResult, result1);
        assertEquals(expResult, result2);
        assertEquals(expResult, result3);
    }
    
}
