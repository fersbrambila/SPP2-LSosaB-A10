/*
 * Luisa Fernanda Sosa Brambila
 * A01411485
 * IIS
 */
package spp2.lsosab.a10;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		int [][] a, b;
        int tamaño=  solicitarTamaño();
        
        a= crearM("A", tamaño);
        b= crearM("B", tamaño);
        
                
        System.out.println("La resta de las matrices es");
         restarM(a,b);
         
        System.out.println("La multiplicación de las matrices es");
        multiplicarM(a,b);
        
    }

    static int[][] crearM(String dato ,int tamaño){
       
        System.out.println("Ingresa los datos de la matriz " + dato );
                int [][] mat= new int [tamaño][tamaño];        
        for (int i=0;i<mat.length;i++){
                  for (int j=0;j<mat.length;j++){
        
        mat[i][j]= solicitarEntero();  }
                
    }    return mat;
    }
    
    
    static int solicitarTamaño(){
     Scanner tec= new Scanner (System.in);
        int tamaño;
         boolean test;
              do {
            System.out.println("Introduce el tamaño de la matriz");
            try {
                tamaño= tec.nextInt();
                test=true;
                 }
            catch (Exception ex) {
                test=false;
                System.out.println("El dato insertado no es entero " + ex);
                tamaño=tec.nextInt();
            }   
        tamaño= tec.nextInt();      
     } while (test == false);
        return tamaño; 
    }
   
    static int solicitarEntero(){
        Scanner tec= new Scanner (System.in);
        int ent;
        boolean test;
        do {
            System.out.println("Introduce contenido de la matriz ");
            try {
                ent= tec.nextInt();
                test=true;
                 }
            catch (Exception ex) {
                test=false;
                System.out.println("El dato insertado no es entero " + ex);
                ent=tec.nextInt();
            }   
        ent= tec.nextInt();      
     } while (test == false);
        return ent ; 
    }

   static int [][] restarM(int[][] a,int[][] b){
       int[][]r= new int[a.length][a.length];
       for (int i=0;i<a.length;i++){
           for (int j=0;j<a[i].length;j++){
       
       r[i][j]= a[i][j]-b[i][j];
           System.out.print("-"+r[i][j]+"-");
        }
            System.out.println();
       
   }
       return r;
   }
   
   static int [][] multiplicarM(int[][] a,int[][] b)   {
   int [][] mR= new int [a.length][a.length];
        int [][] matrizF= new int [a.length][a.length];
         
         for (int i=0; i<a.length;i++){           
        for (int j=0;j<a.length;j++){  
        for (int k = 0; k < a.length; k++) {
                    mR[i][j]=a[i][k]*b[k][j];
              matrizF[i][j]=matrizF[i][j]+mR[i][j];
                       
        System.out.print("-"+mR[i][j]+"-");        
        } }          
                System.out.println();
         }         
         
         System.out.println("Suma de la multiplicación de las matrices  ");
                  for (int i=0; i<a.length;i++){           
        for (int j=0;j<a.length;j++){ 
            matrizF[i][j]=0;  
        for (int k = 0; k < a.length; k++) {
                    mR[i][j]=a[i][k]*b[k][j];
              matrizF[i][j]=matrizF[i][j]+mR[i][j];  
        } 
        System.out.print("-"+matrizF[i][j]+"-");           
        }
        System.out.println();
         }
         
        return matrizF;

}
}
