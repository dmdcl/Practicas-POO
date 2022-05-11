/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_usar_throw;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valor = 0;
        try {
            System.out.println("Introduce tu edad (valor entero positivo): ");
            valor = input.nextInt();
            if (valor < 0) {
                throw new Exception("El valor " + valor + " no es una edad valida");
            }
            System.out.println("La edad capturada es: " + valor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
