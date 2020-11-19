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
    
    public Tarea_TDDTest() {
//        operacion = new Tarea_TDD();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void testMain() {
        Tarea_TDD operacion = new Tarea_TDD();
        int response = operacion.Factorial(0);
        System.out.println(response);
        assertEquals(1, response);
    }
    
}
