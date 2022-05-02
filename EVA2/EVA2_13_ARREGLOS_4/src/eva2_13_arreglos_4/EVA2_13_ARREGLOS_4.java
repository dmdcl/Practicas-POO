/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_13_ARREGLOS_4 {
    //CONSTANTES EN JAVA:
    public static final int TAMA = 50;
    //final --> sirve para declarar constantes
    //final --> solo permite asignar una vez un valor
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloEdad = new int [TAMA];//bytes que ocupa un entero --> 4 bytes
        System.out.println("Tamaño de arregloEdad " + arregloEdad.length);
        Scanner input = new Scanner(System.in);
        //32 capturas --> for
        //CAPTURA DE DATOS
        for (int i = 0; i < arregloEdad.length; i++) {//i -> index --> indice
            System.out.println("Cual es tu edad? ");
            arregloEdad[i] = input.nextInt();
        }
        //MOSTRAR LOS DATOS
        for (int i = 0; i < arregloEdad.length; i++) { 
            System.out.println("[" + arregloEdad[i] + "]");
        }
    }
    
}
