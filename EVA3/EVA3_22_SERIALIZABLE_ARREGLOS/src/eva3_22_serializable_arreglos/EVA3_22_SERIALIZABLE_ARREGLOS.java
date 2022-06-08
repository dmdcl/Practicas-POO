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

    public static void main(String[] args) {
        // TODO code application logic here
        //COLLECTIONS. <TIPOS DE DATOS GENERICOS>
        ArrayList<Persona> miListaPerso = new ArrayList(); 
        
        //EN JAVA ---> LISTAS, ARREGLOS, ETC: 0 --> N- 1
        miListaPerso.add(new Persona("Dirgo",18));
        miListaPerso.add(new Persona("RGajau",17));
        miListaPerso.add(new Persona("Topti",18));
        miListaPerso.add(new Persona("Luisa",18));
        
        escribirObjetos(miListaPerso);
        leerObjetos();
    }
    
    
    public static void escribirObjetos(Object obj) {
        try {
            FileOutputStream openFile = new FileOutputStream("src/archivos/archivo.1");
            ObjectOutputStream saveObject = new ObjectOutputStream(openFile);
            saveObject.writeObject(obj);
            saveObject.flush();
            saveObject.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
      public static void leerObjetos() {

        try {
            FileInputStream openFile = new FileInputStream("src/archivos/archivo.1");
            ObjectInputStream readObject = new ObjectInputStream(openFile);
            
            ArrayList<Persona> lista = (ArrayList)readObject.readObject(); //OBJETO (Clase Object)
            for(int i=0; i<lista.size();i++){
                System.out.println("Nombre: "+ lista.get(i).getNombre()+" | Edad: "+ lista.get(i).getEdad());
            } 
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    
}

class Persona implements Serializable {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
