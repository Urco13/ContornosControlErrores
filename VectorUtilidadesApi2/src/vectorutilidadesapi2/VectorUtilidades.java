package vectorutilidadesapi2;


import java.util.Random;

//Practica :  Realizar las pruebas de código para la clase    VectorUtilidades.
/*-vector de maximo 100 elementos
*  -se crea con  enteros obtenidos de forma aleatoria no repes
 * -metodos:  devuelve el mayor
*                  calcula y devuelve suma de numeros 
*                  buscar  UN valor
*                 compara 2 vectores
 */


/**
 *
 * @author urco1
 */
public class VectorUtilidades {
     final int MAXIMO = 100;
 /**
  * Llenar un vector con  enteros obtenidos de forma aleatoria no repes
  */
public void llenarVector(int vector[]) throws Exception{  
    
     Random aleatorio=new Random(); 
     int n=Integer.MIN_VALUE;
    //     System.out.println(vector.length);
     if (vector.length<=MAXIMO){            
        for(int i=0; i<vector.length; i++)
        {    
                boolean existe=true;
                while (existe)
                    {               
                    n=aleatorio.nextInt(MAXIMO);     /* Siguiente valor aleatorio */
                    existe=comprobar_existe(vector,n);
                       
                    }
                vector[i]=n;
               
         }
       
     }else 
         throw new Exception("Maximo 100 elementos");
     
}
/**
 * @param vector
 * @param elementos
 * @return devuelve el mayor
 */
public static int elMayor(int vector[]){
    int mayor=Integer.MIN_VALUE;

        for(int i=0; i<vector.length; i++){
            if(vector[i]>mayor) 
               mayor=vector[i];
       
   }

     return mayor;
}
/**
 * @param vector
 * @param elementos
 * @return calcula suma de numeros
 */
 public static long sumaTotal(int vector[]){
     long suma = 0;
     for(int i=0; i< vector.length; i++){
           suma +=vector[i];
     }
     
   return suma;
 }
/**
 * buscar valor
 * @param vector
 * @param numero
 * @return 
 */
  private  boolean comprobar_existe(int vector[],int numero)
  {
          int i=0;
        boolean existe= false;  
          for (i=0; i<vector.length&& existe==false; i++)
        {
            if (vector[i]==numero)
                existe=true;
        }
        return existe;
  }  
   /**
    * compara 2 vectores
    * @param a
    * @param b
    * @return 
    */
  public static boolean  equals(int a[],int b[]){
      
      if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("null argument");
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

       return true;   }
}


