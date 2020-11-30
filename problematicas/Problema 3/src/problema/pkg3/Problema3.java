/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg3;

/**
 *
 * @author jamil
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        int contador = 3;
        int numero =2;
        String cadenafinal="";
        
        
        while (numero<=37) {
             System.out.printf("%s ", numero);
              numero= numero+contador;
              contador = contador + 2;
    
            }
             System.out.println(); 
        }
       
    }