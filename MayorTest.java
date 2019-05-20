/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaime_Alvarez
 */
public class MayorTest {
    
    public MayorTest() {
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
     * Test of mayor method, of class Mayor.
     */
    @Test
    public void testMayor() {
        System.out.println("mayor");
        //int[] lista = null;
        //int expResult = 0;
        //int result = Mayor.mayor(lista);
        try{
        assertEquals(null, Mayor.mayor(null));
        // TODO review the generated test code and remove the default call to fail.
        fail("Debería haber lanzado una NullPointerException.");
        }catch(NullPointerException e){
            
        }
        assertEquals(9, Mayor.mayor(new int[]{3,4,2,6,9,8}));
        assertEquals(9, Mayor.mayor(new int[]{9,7,8}));
        assertEquals(9, Mayor.mayor(new int[]{7,9,8}));
        assertEquals(9, Mayor.mayor(new int[]{7,8,9}));
        assertEquals(9, Mayor.mayor(new int[]{3,4,9,6,9,8}));
        assertEquals(9, Mayor.mayor(new int[]{9}));
        assertEquals(-2, Mayor.mayor(new int[]{-4,-8,-2,-9}));
        
    }
    
}
