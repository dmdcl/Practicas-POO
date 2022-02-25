/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_clase_computadora;

/**
 *
 * @author user
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora objComp1, objComp2;//declaracion
        objComp1 = new Computadora();
        objComp2 = new Computadora();
        //usar los objetos
        objComp1.setMarca("HP");
        objComp1.setProcesador("I5");
        objComp1.setDiscoduro("512");
        objComp1.setAño(2015);
        objComp1.setPrecio(5600.00);
        objComp1.calcularPrecio();
        objComp1.imprimirDatos();
    }
    
}

class Computadora{
   private String marca,procesador, discoduro;
   private int año;
   private double precio;
    //comportamiento
    public void setMarca(String valor){
        marca = valor;
    }
    public String getMarca(){
        return marca;
    }
    public void setProcesador(String valor){
        procesador = valor;
    }
    public String getProcesador(){
        return procesador;
    }
    public void setDiscoduro(String valor){
        discoduro = valor;
    }
    public String getDiscoduro(){
        return discoduro;
    }
    public void setAño(int valor){
        año = valor;
    }
    public int getAño(){
        return año;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public double getPrecio(){
       return precio;
   }
    
    public double calcularPrecio(){
        return precio = precio * 1.16;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("Disco duro: " + discoduro);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }
}