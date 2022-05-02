/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_clases_abstractas;

/**
 *
 * @author user
 */
public class Cliente extends Persona {
    private String RFC;

    public Cliente() {
        this.RFC = "";
    }

    public Cliente(String RFC, String nombre, int edad) {
        super(nombre, edad);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

  
    
    
    

    
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("RFC: " + getRFC());
    }
    
}
