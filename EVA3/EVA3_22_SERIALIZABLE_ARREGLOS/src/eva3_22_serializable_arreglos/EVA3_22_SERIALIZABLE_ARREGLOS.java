/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author invitado
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COLLECTIONS. <TIPOS DE DATOS GENERICOS>
        ArrayList<Persona> miListaPerso = new ArrayList();
        //EN JAVA ---> LISTAS, ARREGLOS, ETC: 0 --> N- 1
        miListaPerso.add(new Persona ("Juan","Perez"));
                escribirObj(miListaPerso);
                leerObj();
   
    }
    
    public static void escribirObj(Object obj) {
        try {
            FileOutputStream abrirArch = new FileOutputStream("c://ARCHIVOS/ARCHIVO3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void leerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("c://ARCHIVOS/ARCHIVO3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            ArrayList<Persona> miListaPerso = (ArrayList<Persona>)leerObjeto.readObject();//OBJETO (Clase Object)
            for(int i = 0; i < miListaPerso.size(); i++){
                Persona persona = miListaPerso.get(i);
                System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
            }
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    class Persona implements Serializable {

        private String nombre, apellido;

        public Persona() {
        }

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

    }

}
