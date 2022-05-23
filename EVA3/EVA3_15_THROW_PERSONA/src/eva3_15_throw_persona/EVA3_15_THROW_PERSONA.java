/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_15_throw_persona;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA3_15_THROW_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true;
        Persona persona = new Persona();
        persona.setNombre("Juan Perez");
        do {
            try {
                persona.setEdad(capturarEdad());
                datoErroneo = false;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (datoErroneo);

    }

    public static int capturarEdad() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Captura la edad");
        int valor = 0;
        try {
            valor = input.nextInt();
        } catch (InputMismatchException ex) {
            throw new Exception("Introdujiste una cadena de texto, no es un numero valido");
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
