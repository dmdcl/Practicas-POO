/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author invitado
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path ruta = Paths.get("c://ARCHIVOS/WILLYREX.txt");
        //ABRIMOS EL ARCHIVO
        OutputStream abrirArch;
        //ESCRIBIMOS EN  EL ARCHIVO
        OutputStreamWriter escribirArch;
        //CONVERTIMOS BYTES A CARACTERES
        BufferedWriter escribirTexto;
        
        try {
            abrirArch = Files.newOutputStream(ruta);
            escribirArch = new OutputStreamWriter(abrirArch);
            escribirTexto = new BufferedWriter(escribirArch);
            escribirTexto.write("<|°_°|>");
            escribirTexto.newLine();
            escribirTexto.write("AERODYNAMIC");
            escribirTexto.flush();//HACE PERMANENTES LOS CAMBIOS
            escribirTexto.close();//SIEMPRE HAY QUE CERRAR EL STREAM
        } catch (IOException ex) {
            
        }

    }
    
}
