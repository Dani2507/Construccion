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
 * @author Daniel
 */
public class JuegoTest {
    
    public JuegoTest() {
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
     * Test of procezarComando method, of class Juego.
     */
    @Test
    public void testProcesarComando() throws Exception {
        System.out.println("procesarComando");
        Comandos comandos = new Comandos("ir","este");
        Juego instance = new Juego();
        assertEquals(false, instance.procesarComando(comandos));
        // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype.");
    }

    

    /**
     * Test of revisarComandoPuerta method, of class Juego.
     */
    @Test
    public void testRevisarComandoPuerta() throws Exception {
        System.out.println("revisarComandoPuerta");
        Comandos comandos = new Comandos("puerta", "este");
        Juego instance = new Juego();
        instance.revisarComandoPuerta(comandos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revisarSalidaSeleccionada method, of class Juego.
     */
    @Test
    public void testRevisarSalidaSeleccionada() throws Exception {
        System.out.println("revisarSalidaSeleccionada");
        Comandos comandos = null;
        Juego instance = new Juego();
        instance.revisarSalidaSeleccionada(comandos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}
