/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
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
public class ParsearArchivoTest {
    
    public ParsearArchivoTest() {
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
     * Test of leerArchivo method, of class ParsearArchivo.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testLeerArchivo() throws Exception {
        String nombre = "file.csv";
        ArrayList<String[]> expResult= new ArrayList<>();
        String[] prueba={"outside","outside the main entrance of the university","null","theatre","lab","pub"};
        expResult.add(prueba);
        ArrayList<String[]> result= ParsearArchivo.leerArchivo(nombre);
        assertArrayEquals(expResult.toArray(),result.toArray());
       
  
    }
    
}
