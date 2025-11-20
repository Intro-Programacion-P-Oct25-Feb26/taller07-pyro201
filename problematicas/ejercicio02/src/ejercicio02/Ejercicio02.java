/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author A S U S
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int contador = 2;
        String mensaje = "";
        while(num<110){
            num= num+ contador;
            contador= contador+2;
             mensaje = String.format("%s%s\n",mensaje, num);
        }
         System.out.println(mensaje);
    }
    
}
