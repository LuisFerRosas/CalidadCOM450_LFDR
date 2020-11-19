/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_tdd;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class Tarea_TDDTest {
    Tarea_TDD operacion;
    public Tarea_TDDTest() {
        operacion = new Tarea_TDD();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void testFactorial() {
        
        int response = operacion.Factorial(0);
        
        assertEquals(1, response);
    }
    
    @Test
    public void testFactoria2() {
        
        int response = operacion.Factorial(2);
        
        assertEquals(2, response);
    }
    
}
