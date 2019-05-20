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
public class CalculadoraRestaTest {
    private int num1;
    private int num2;
    private int result;

    public CalculadoraRestaTest(int num1, int num2, int result) {
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
            return Arrays.asList(new Object[][]{{10,20,-10},{30,-2,32},{5,5,0}});
        
    }
    @Test
    public void testResta(){
        System.out.println("Resta");
        Calculadora instance=new Calculadora(this.num1,this.num2);
        int calculo=instance.resta();
        assertEquals(this.result,calculo);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
