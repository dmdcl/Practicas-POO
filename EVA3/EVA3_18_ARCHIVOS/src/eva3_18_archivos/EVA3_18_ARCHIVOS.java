/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //RUTA:
            //FileInputStream
            FileInputStream archivo = new FileInputStream("C:/ARCHIVOS/archivo1.txt");            
            /*System.out.println("Leer: " + archivo.read());
            System.out.println("Leer: " + archivo.read());*/
            //LEER TODO EL ARCHIVO
            int caracter = archivo.read();
            while (caracter != -1){
                System.out.print((char)caracter);
                caracter = archivo.read();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
