/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecicio04;

/**
 *
 * @author A S U S
 */
public class Ejecicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        int contador = 1;
        String fraccion = "";
        String mensaje = "";
        while (contador < 15) {
            num = num * -1;
            contador = (contador + 2);
            if (num == 1) {
                fraccion = String.format("+ %s/%s", num, contador);
            }else{
               fraccion = String.format("%s/%s", num, contador);
            }

            mensaje = String.format("%s %s", mensaje, fraccion);
        }
        System.out.println("1" + mensaje);
    }

}
