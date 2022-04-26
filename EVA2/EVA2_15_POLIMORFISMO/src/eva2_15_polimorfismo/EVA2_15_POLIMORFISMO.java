/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_15_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Juan", 30);
        Estudiante estudiante = new Estudiante("21550321", "Maria", 25);
        Docente docente = new Docente ("036","Pedro","",50);
        
        Persona persoEstu = estudiante;
        
    }
    
}

class Docente extends Estudiante{
    private String numeroRegistro;

    public Docente() {
        super();
    }

    public Docente(String numeroRegistro, String numeroControl) {
        super(numeroControl);
        this.numeroRegistro = numeroRegistro;
    }

    public Docente(String numeroRegistro, String numeroControl, String nombre, int edad) {
        super(numeroControl, nombre, edad);
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
}

class Estudiante extends Persona{
    private String numeroControl;
    
    public Estudiante() {
        super();
    }

    public Estudiante(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad);
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    
}

class Persona{
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