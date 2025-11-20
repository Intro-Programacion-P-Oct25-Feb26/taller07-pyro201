/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

/**
 *
 * @author A S U S
 */
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num = 1;
        int contador = 1;
        String mensaje = "";
        while(num<37){
            num= num+ contador;
            contador= contador+2;
             mensaje = String.format("%s%s\n",mensaje, num);
        }
         System.out.println(mensaje);
    }
    
}
