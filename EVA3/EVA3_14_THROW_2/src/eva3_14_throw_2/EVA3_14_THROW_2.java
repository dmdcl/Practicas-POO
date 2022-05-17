/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_14_throw_2;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author invitado
 */
public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan Perez");
        try {
            persona.setEdad(capturarEdad());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            Persona persona2 = new Persona("Juan Perez",capturarEdad());
        } catch (Exception ex) {
   
        }
    }
public static int capturarEdad() throws Exception{
    Scanner input = new Scanner(System.in);
    System.out.println("Captura la edad");
    int valor = 0;
    try{
        valor = input.nextInt();
    }catch(InputMismatchException ex){
        throw new Exception ("Introdujiste una cadena de texto, no es un numero valido");
    }
    return valor;
}

    
}




class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre; 
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if ((edad >= 0) && (edad <= 130)) {
            this.edad = edad;
        } else {
            throw new Exception("Rango de edad incorrecto!!");
        }
    }
    
}
