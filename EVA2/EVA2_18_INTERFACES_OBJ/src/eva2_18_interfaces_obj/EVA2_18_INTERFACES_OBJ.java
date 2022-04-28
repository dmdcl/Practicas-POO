/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_interfaces_obj;

/**
 *
 * @author invitado
 */
public class EVA2_18_INTERFACES_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Ana");
        
        Mensajes mensaje = persona;
        mensaje.mostrarMensaje();
    }
    
}

interface Mensajes{
    public void mostrarMensaje();
}

class Persona implements Mensajes{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println(nombre);   
    }
    
}