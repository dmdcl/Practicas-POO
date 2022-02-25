/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_mod_acceso;

/**
 *
 * @author user
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona();//instanciar (crear un objeto)
        per1.setId("21550321");
        per1.setNombre("Dirgo");
        per1.setEdad(18);
        
        System.out.println("Nombre: " + per1.getNombre());
        
        Persona per2 = new Persona();
        per2.setId("21550322");
        per2.setNombre("Topti");
        per2.setEdad(8932);
          System.out.println("Nombre: " + per2.getNombre());
    }
    
}

class Persona{
    //ATRIBUTOS (VARIABLES)
    private String id;
    private String nombre;
    private int edad;
    //COMPORTAMIENTO (MÉTODOS)
    //PARA LEER Y MODIFICAR LOS ATRIBUTOS, USAMOS METODOS DE LECTURA/ESCRITURA
    
    //LEER --> GET
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
      //ASIGNAR --> SET
    public void setId(String valor){
        id = valor;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
}