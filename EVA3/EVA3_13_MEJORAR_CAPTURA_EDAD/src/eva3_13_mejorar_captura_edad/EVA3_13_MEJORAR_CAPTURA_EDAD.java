/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_mejorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true;
        Scanner input = new Scanner(System.in);
        int valor = 0;
        do {
            try {
                System.out.println("Introduce tu edad (valor entero positivo): ");
                valor = input.nextInt();
                if (valor < 0) {
                    throw new Exception("El valor " + valor + " no es una edad valida");
                }
                System.out.println("La edad capturada es: " + valor);
                datoErroneo = false;
            }catch(InputMismatchException e){
                System.out.println("No es un numero valido");
            } catch (Exception e) {
                System.out.println("Edad no valida");
            }
        } while (datoErroneo);
    }

}
