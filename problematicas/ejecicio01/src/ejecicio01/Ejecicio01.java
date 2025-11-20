/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Ejecicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int contador =1;
        String posicion;
        double edad;
        double estatura;
        double suma_edad = 0;
        double suma_estatura = 0;
        double pro_edad;
        double pro_estatura;
        String lista = "";
        String mensaje = "";
        while  (contador<=5){
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese edad del jugador");
            edad = entrada.nextDouble();
            System.out.println("Ingrese estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            suma_edad = suma_edad + edad;
            suma_estatura = suma_estatura + estatura;
            lista =String.format("%s%s\n", lista, edad);
            mensaje = String.format("%s Nombre %s-%s-, estatura %.2f, "
                    + "edad %s \n", mensaje, nombre, posicion, estatura, edad);
            contador = contador + 1;
        }
        pro_edad= suma_edad/5;
        pro_estatura= suma_estatura/5;
        System.out.printf("Listado de Jugadores\n%sListado edades\n%sPromedio de"
                + " edades:\t%.2f\nPromedio de estatura: %.2f", mensaje, lista, 
                pro_edad, pro_estatura);
        
                
                
                
    }
    
}
