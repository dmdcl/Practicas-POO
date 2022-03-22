/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_herencia;

/**
 *
 * @author user
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona perso1 = new Persona();
        //perso1
        Estudiante estu1 = new Estudiante("Diego", 18, "21550321");
        //estu1.setNombre("JUANA");
        //estu1.setEdad(22);
        //estu1.setNumeroControl("21550321");
        //estu1.imprimirDatos();
        //System.out.println("No de control: " + estu1.getNumeroControl());
        estu1.imprimirDatos();
        Maestro mtro1 = new Maestro("Juan Peréz", 39, "123456789");
        mtro1.imprimirDatos();
    }
    
}

//SUBCLASE MAESTRO
//EXTENDS > IS A > Estudiante ES UNA Persona
class Maestro extends Persona{
    //NO DE REGISTRO
    private String numeroRegistro;
    
    public Maestro(){
        super();
        System.out.println("CLASE MAESTRO");
    }
    
    public Maestro(String nombre, int edad, String numeroRegistro){
        super(nombre,edad);
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//ESTOY LLAMANDO AL METODO IMPRIMIRDATOS DE PERSONA (SUPERCLASE)
        System.out.println("No. de registro: " + numeroRegistro);
    }
}

//SUBCLASES (HIJO)
class Estudiante extends Persona{
    private String numeroControl;

    //CONSTRUCTOR DEFAULT:
    public Estudiante(){
        super(); //LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        System.out.println("CLASE ESTUDIANTE");
    }
           
    public Estudiante(String nombre, int edad, String numeroControl){
        super(nombre, edad);//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.numeroControl = numeroControl;
    }
    
    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    /*public void mostrarNombre(){
        System.out.println ("Nombre del estudiante " + getNombre());
    }
    */

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//ESTOY LLAMANDO AL METODO IMPRIMIRDATOS DE PERSONA (SUPERCLASE)
        System.out.println("No. de control: " + numeroControl);
    }
}

class Persona{//SUPERCLASE (PADRE)
    private String nombre;
    private int edad;
    
    public Persona() {
        this.nombre = "XXXXXXXXXXX";
        this.edad = 1000;
        System.out.println("CLASE PERSONA");
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
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}