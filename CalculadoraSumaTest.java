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
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Jaime_Alvarez
 */
@RunWith(Parameterized.class)
public class CalculadoraSumaTest {
    private int num1;
    private int num2;
    private int result;

    public CalculadoraSumaTest(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
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
    @Parameters
    public static Collection<Object[]> numeros(){
            return Arrays.asList(new Object[][]{{20,10,30},{30,-2,18},{5,2,7}});
        
    }
    @Test
    public void testSuma(){
        System.out.println("Suma");
        Calculadora instance=new Calculadora(this.num1,this.num2);
        int calculo=instance.suma();
        assertEquals(this.result,calculo);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
