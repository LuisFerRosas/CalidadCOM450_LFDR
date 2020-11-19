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
    
    @Test
    public void testFactoria3() {
        
        int response = operacion.Factorial(3);
        
        assertEquals(6, response);
    }
    
    @Test
    public void testFactoria4() {
        
        int response = operacion.Factorial(5);
        
        assertEquals(120, response);
    }
    
    @Test
    public void testFactoria5() {
        
        int response = operacion.Factorial(8);
        
        assertEquals(40320, response);
    }
}
