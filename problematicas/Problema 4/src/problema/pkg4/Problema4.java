/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4;

/**
 *
 * @author jamil
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables 
        int numerador = 1;
        int denominador = 1;
        int contador = 1;
        
        do {
            if((contador%2)==0){
                System.out.printf("%s%d/%d ", "-", numerador, denominador);
            }else{
                System.out.printf("%s%d/%d ", "+", numerador, denominador);
            }
            contador = contador + 1;
            denominador = denominador + 2;
        }while (contador<=8);
        System.out.println();
       
    }
    
}
