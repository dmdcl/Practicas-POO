/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_interfaces;

/**
 *
 * @author user
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Diego");
        perso.setEdad(18);
        perso.imprimirDatos();
        
        Vehiculo vehiculo = new Vehiculo ("Chevy", "C2");
        vehiculo.imprimirDatos();
        vehiculo.mostrarMensaje();
    }
    
}

class Persona implements MuestraDatos {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
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

class Vehiculo implements MuestraDatos, Mensaje{
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola mundo!");
    }
    
    
}

interface MuestraDatos{
    //SOLO ACEPTAN METODOS PUBLICOS
    //SOLO ACEPTA DECLARACIONES DE METODOS --> SOLO ACEPTA METODOS ABSTRACTOS
    public void imprimirDatos();
}

interface Mensaje{
    public void mostrarMensaje();
}