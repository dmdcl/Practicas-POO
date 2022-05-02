/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_arreglos_3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_12_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] arregloPer = new Persona [32];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 32; i++) {//i -> index --> indice
            //crear el objeto:
            arregloPer[i] = new Persona();
            System.out.println("Cual es tu nombre? ");
            arregloPer[i].setNombre(input.nextLine());
        }
        
        //MOSTRAR LOS DATOS
        for (int i = 0; i < 32; i++) { 
            
            
            
            System.out.println("Nombre : " + arregloPer[1].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;

    public Persona() {
    }

     public Persona(String nombre) {
         this.nombre = nombre;
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}