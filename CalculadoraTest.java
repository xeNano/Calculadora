/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacalculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Jaime_Alvarez
 */
@RunWith(Parameterized.class)
public class CalculadoraTest {

    private int num1;
    private int num2;
    private int result;

    public CalculadoraTest(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }
    @Parameters
    public static Collection<Object[]> numeros(){
        return Arrays.asList(new Object[][]{{20,10,2},{30,-2,-15},{5,3,1}});
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
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(20, 10);;
        int expResult = 30;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testRestaA() {
        System.out.println("restaA");
        Calculadora instance = new Calculadora(20, 10);;
        int expResult = 10;
        int result = instance.resta();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testRestaB() {
        System.out.println("restaB");
        Calculadora instance = new Calculadora(5, 20);;
        int expResult = 15;
        int result = instance.resta();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testResta2False() {
        System.out.println("resta2 false");
        Calculadora instance = new Calculadora(20, 30);;
        assertFalse("Fallo resta2 false",instance.resta2());
        
    }
    @Test
    public void testResta2True() {
        System.out.println("resta2 true");
        Calculadora instance = new Calculadora(20, 10);;
        assertTrue("Fallo resta2 true",instance.resta2());
        
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora(20, 10);;
        int expResult = 200;
        int result = instance.multiplica();
        assertEquals("Fallo en la multiplicación", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testDivide() {
        System.out.println("Divide");
        Calculadora instance = new Calculadora(20, 10);;
        int expResult = 2;
        int result = instance.divide();
        assertEquals("Fallo en la división", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test

    public void testDivideFail() {
        System.out.println("divide");
        try {
            Calculadora instance = new Calculadora(20,0);;
            //double expResult = 2.0;
            int result = instance.divide();
            assertEquals(this.result, result);

            // TODO review the generated test code and remove the default call to fail.
           fail("Fallo,no lanzó excepción.");
        } catch (ArithmeticException e) {
        }
    }
     @Test
    public void testDivide2Null() {
        System.out.println("Divide2 null");
        Calculadora instance = new Calculadora(20, 0);;
        assertNull("Fallo divide2()  null", instance.divide2());
        
    }
     @Test
    public void testDivide2NotNull() {
        System.out.println("Divide2 not null");
        Calculadora instance = new Calculadora(20, 10);;
        assertNotNull("Fallo divide2() not null", instance.divide2());
        
    }
     @Test
     //esto lo hice por probar como testear clases
    public void testDivide2isString() {
        System.out.println("Divide2 is String");
        Calculadora instance = new Calculadora(20, 10);       
        assertSame("Fallo divide2 is String",String.class ,instance.divide2().getClass());
       
    }
     
    @Test
     public void testDivide2String() {
        System.out.println("Divide2 String");
        Calculadora instance = new Calculadora(20, 10);
        String result="2";
        assertEquals("Fallo divide2 String",result,instance.divide2());
       
    }

}
