/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_stack_overflow;

/**
 *
 * @author invitado
 */
public class EVA3_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static int cont = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        terminarStack();
    }
    
    //stack es la memoria para variables locales y llamadas
    //a funcion
    public static void terminarStack(){
        cont = cont + 1; 
        System.out.println(cont);
        terminarStack();//recursividad
                
    }
}
