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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Jaime_Alvarez
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({pruebacalculadora.CalculadoraSumaTest.class, pruebacalculadora.CalculadoraTest.class, pruebacalculadora.CalculadoraMultiplicaTest.class, pruebacalculadora.MayorTest.class, pruebacalculadora.CalculadoraRestaTest.class})
public class PruebaTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
