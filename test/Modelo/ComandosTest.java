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
public class ComandosTest {
    
    @Test
    public void testGetPalabraComando() {
     Comandos comandos = new Comandos("ir","norte");
    String palabra= comandos.getPalabraComando();
     assertEquals(palabra,"ir");
    }

    /**
     * Test of getSegundaPalabraComando method, of class Comandos.
     */
    @Test
    public void testGetSegundaPalabraComando() {
         Comandos comandos = new Comandos("ir","norte");
    boolean estado = comandos.tieneSegundaPalabra();
     assertEquals(estado,true);
    }

    /**
     * Test of esDesconocido method, of class Comandos.
     */
    @Test
    public void testEsDesconocido() {
     Comandos comandos = new Comandos("ir","norte");
    boolean estado = comandos.esDesconocido();
     assertEquals(estado,false);
    }

    /**
     * Test of tieneSegundaPalabra method, of class Comandos.
     */
    @Test
    public void testTieneSegundaPalabra() {
  
    Comandos comandos = new Comandos("ir","norte");
     boolean estado = comandos.tieneSegundaPalabra();
     assertEquals(estado,true);
    }
    
}
