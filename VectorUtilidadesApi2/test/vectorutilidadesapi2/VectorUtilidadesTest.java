/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorutilidadesapi2;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author urco1
 */
public class VectorUtilidadesTest {
    
    public VectorUtilidadesTest() {
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
    public void testPruebasValidas() throws Exception{
        System.out.println("Comprobacion que al llenar el vector no se repitan los numeros");
        int[] vector1 = new int[2];
        VectorUtilidades instance = new VectorUtilidades();
        instance.llenarVector(vector1);
        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector1.length; j++) {
                if (i != j) {
                     assertNotEquals(vector1[i],vector1[j]);
                }
            }
        }//fin for
        
        System.out.println("Comprobacion rangos validos del llenarVector tamaño 18");
        int[] vector2=new int[18];
        VectorUtilidades instance2 = new VectorUtilidades();
        instance2.llenarVector(vector2);
        
        System.out.println("Comprobacion rangos validos  llenarVector tamaño 36");
        int[] vector3=new int[18];
        VectorUtilidades instance3 = new VectorUtilidades();
        instance3.llenarVector(vector3);
        
        System.out.println("Comprobacion limite superior llenarVector tamaño 100");
        int[] vector4=new int[100];
        /*
        Se rellena antes con fill porque sino entrariamos en un bucle infinito
        ya que por defecto el array se rellena con 0
        */
        Arrays.fill(vector4, -1);
        VectorUtilidades instance4 = new VectorUtilidades();
        instance4.llenarVector(vector4);
        
        System.out.println("Comprobacion limite inferior llenarVector tamaño 0");
        int[] vector5 = new int[0];
        VectorUtilidades instance5 = new VectorUtilidades();
        instance5.llenarVector(vector5);
        
        System.out.println("Comprobacion elMayor datos de entrada 5 8 10 mayor=10");
        int[] vector6 ={5,8,10};
        assertEquals(10, VectorUtilidades.elMayor(vector6), 0);
        
        System.out.println("Comprobacion elMayor Integer.MinValue");
        int[] vector7 ={Integer.MIN_VALUE};
        assertEquals(Integer.MIN_VALUE, VectorUtilidades.elMayor(vector7), 0);
        
        System.out.println("Comprobacion sumaTotal datos de entrada 5 8 10 suma=23");
        int[] vector8 ={5,8,10};
        assertEquals(23, VectorUtilidades.sumaTotal(vector8));
        
//        System.out.println("Comprobacion comprobar_existe valores 5,5");
//        int[] vector9 ={5,5};
//        VectorUtilidades instance6 = new VectorUtilidades();
//        assertFalse(instance6.);

        System.out.println("Comprobar equals que dos vectores son iguales ");
        int[] vector10 ={5,8,10};
        int[] vector11 ={5,8,10};
        assertEquals(true,VectorUtilidades.equals(vector10, vector11));
    }//fin test pruebas validas
    
    /**
     * Test of llenarVector method, of class VectorUtilidades.
     */
    @Test(expected = NegativeArraySizeException.class)
    public void testLlenarVector() throws Exception {
        System.out.println("Comprobacion llenarVector numero < 0 numero=-1");
        int[] vector = new int[-1];
        VectorUtilidades instance = new VectorUtilidades();
        instance.llenarVector(vector);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test(expected = Exception.class)
    public void testLlenarVector1() throws Exception {
        System.out.println("Comprobacion llenarVector numero > 100 numero=1001");
        int[] vector = new int[101];
        VectorUtilidades instance = new VectorUtilidades();
        instance.llenarVector(vector);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    /**
     * Test of elMayor method, of class VectorUtilidades.
     */
    @Test
    public void testElMayor() {
        System.out.println("Comprobamos elMayor probocando una respuesta inesperada 5, 8, 10 esperaremos un 5");
        int[] vector ={5,8,10};
        int expResult = 0;
        int result = VectorUtilidades.elMayor(vector);
        assertNotEquals(5, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of sumaTotal method, of class VectorUtilidades.
     */
    @Test
    public void testSumaTotal() {
        System.out.println("Comprobamos sumaTotal con un resultado no esperado 5+8+10 esperaremos un 5");
        int[] vector = {5,8,10};
        long result = VectorUtilidades.sumaTotal(vector);
        assertNotEquals(5, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class VectorUtilidades.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testEquals() {
        System.out.println("Comprobamos equals que los vectores sean null");
        int[] a = null;
        int[] b = null;
        boolean expResult = false;
        boolean result = VectorUtilidades.equals(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testEquals1(){
        System.out.println("Comprobamos equals que los vectores son de distinta longitud");
        int[]a= new int[2];
        int[]b= new int[3];
        boolean expResult =false;
        boolean result = VectorUtilidades.equals(a, b);
        assertFalse(result);
    }
}
