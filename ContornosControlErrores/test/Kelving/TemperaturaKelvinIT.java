/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelving;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam115
 */
public class TemperaturaKelvinIT {
    
    public TemperaturaKelvinIT() {
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
    @Test
    public void testTemperaturaKelvin(){
        System.out.println("   **Constructor  **");
        System.out.println("1-Prueba constructor sin datos");
        TemperaturaKelvin sindato= new TemperaturaKelvin();
        assertNotNull(sindato);
        //otra forma
        System.out.println("prueba getTemperaturaKelvin()");
        assertEquals(0, sindato.getTemperaturaKelvin(),0.0);
        
        System.out.println("2-Prueba constructor con dato == 50 ");
        TemperaturaKelvin objeto =new TemperaturaKelvin(50);
        assertEquals(50, objeto.getTemperaturaKelvin(),0.0);
    }
    
     @Test
    public void testGetTemperaturaCelsius0() {
        System.out.println("getTemperaturaCelsius");
        System.out.println("Valor intermedio obtener el valor Celsius de valor 50");
        TemperaturaKelvin instance = new TemperaturaKelvin(0);
        double result = instance.getTemperaturaCelsius();
        assertEquals(-223.149, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");//las fail
    }
    /**
     * Test of getTemperaturaCelsius method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaCelsius() {
        System.out.println("getTemperaturaCelsius");
        System.out.println("Valor intermedio obtener el valor Celsius de valor 50");
        TemperaturaKelvin instance = new TemperaturaKelvin(50);
        double result = instance.getTemperaturaCelsius();
        assertEquals(-223.149, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");//las fail
    }
    @Test
    public void testGetTemperaturaCelsius2(){
        System.out.println("2-testGetTemperaturaCelsius() ");
        System.out.println("Maximo valor double");
        TemperaturaKelvin instance = new TemperaturaKelvin(Double.MAX_VALUE);
        double result=1.7976931348623157E308;
        assertEquals(result,instance.getTemperaturaCelsius(),0.0);
        //mismo valor error sin delta
        System.out.println(Double.MAX_VALUE+" K=> "+instance.getTemperaturaCelsius());
    }
    @Test
    public void testGetTemperaturaCelsius3(){
        System.out.println("3-testGetTemperaturaCelsius() ");
        System.out.println("Minimo valor double");
        TemperaturaKelvin instance = new TemperaturaKelvin(-Double.MIN_VALUE);
        double result=-1.7976931348623157E308;
        assertEquals(result,instance.getTemperaturaCelsius(),0.0);
        //mismo valor error sin delta
        System.out.println(Double.MIN_VALUE+" K=> "+instance.getTemperaturaCelsius());
    }
//    /**
//     * Test of getTemperaturaFahrenheit method, of class TemperaturaKelvin.
//     */
//    @Test
//    public void testGetTemperaturaFahrenheit() {
//        System.out.println("getTemperaturaFahrenheit");
//        TemperaturaKelvin instance = new TemperaturaKelvin();
//        double expResult = 0.0;
//        double result = instance.getTemperaturaFahrenheit();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }
//
    @Test
    public void testGetTemperaturaFahrenheit(){
        System.out.println("Maximo valor double");
        System.out.println("1-getTemperaturaFarenheit..."+ Double.MAX_VALUE);
        TemperaturaKelvin instance =new TemperaturaKelvin(Double.MAX_VALUE);
        
        double resultado = instance.getTemperaturaFahrenheit();
        if (Double.isFinite(resultado)) {
            System.out.println("textGetTemperaturaFahrenheit2");
        }else 
            assertEquals(-369.669, resultado, 0.01);
    }
    /**
     * Test of getTemperaturaKelvin method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaKelvin() {
        System.out.println("getTemperaturaKelvin");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = 0.0;
        double result = instance.getTemperaturaKelvin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperaturaKelvin method, of class TemperaturaKelvin.
     */
    @Test
    public void testSetTemperaturaKelvin() {
        System.out.println("setTemperaturaKelvin");
        TemperaturaKelvin instance = new TemperaturaKelvin();//le asigno un valor
        instance.setTemperaturaKelvin(5.0);
         assertEquals(5.0, instance.getTemperaturaKelvin(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private void equals(double d, double resultado, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
