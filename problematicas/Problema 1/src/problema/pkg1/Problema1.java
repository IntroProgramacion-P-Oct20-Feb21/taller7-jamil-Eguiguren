/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema1 {

 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        // contador para saber el número de iteraciones
        int contadorIteraciones = 0;
        // variables para promedio
        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");
        
        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            
            // sumo la edad a sumaEdades
            sumaEdades = sumaEdades + edad;
            // sumo la estatura a sumaEstaturas
            sumaEstaturas = sumaEstaturas + estatura;
            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1;
            
            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, "
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            
            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        } while (bandera);
        
        promedioEdad = sumaEdades/contadorIteraciones;
        promedioEstatura = sumaEstaturas/contadorIteraciones;
        // Promedio de edades:  ?
        cadenaReporte = String.format("%sPromedio de edades: %.2f\n", 
                cadenaReporte, promedioEdad);
        // Promedio de estaturas: ?
        cadenaReporte = String.format("%sPromedio de estaturas: %.2f\n", 
                cadenaReporte, promedioEstatura);
        // presentación de cadena final
        System.out.printf("%s\n", cadenaReporte);
        
    }
}
