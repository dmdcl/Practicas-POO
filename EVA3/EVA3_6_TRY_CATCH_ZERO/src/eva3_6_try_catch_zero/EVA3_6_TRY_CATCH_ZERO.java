/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_try_catch_zero;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_6_TRY_CATCH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero 1:");
        int entero = input.nextInt();
        System.out.println("Introduce un numero entero 2:");
        int entero2= input.nextInt();
        //----------------
        try{
            System.out.println("Division: " + (entero/entero2));
        }catch(ArithmeticException miVariable){
        //miVariable.printStacktrace();//imprime la expecpion sin que 
        System.out.println("Se produjo una division entre cero");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
