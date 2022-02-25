/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clase_auto;

/**
 *
 * @author user
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miAuto = new Automovil();
        miAuto.setMarca ("Ford");
        miAuto.setModelo ("Mustang");
        miAuto.setTipo ("Sedan");
        miAuto.setColor ("Rojo");
        miAuto.setAño (2022);
        miAuto.setPrecio (1167000.00);
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("Tipo: " + miAuto.getTipo());
        System.out.println("Color: " + miAuto.getColor());
        System.out.println("Año: " + miAuto.getAño());
        System.out.println("Precio: " + miAuto.getPrecio());
       
    }
    
}

class Automovil{//TIPOS DE DATOS ABSTRACTOS
    private String marca, modelo, tipo, color;
    private int año;
    private double precio;
    //COMPORTAMIENTO
    //METODOS SET/GET
    public void setMarca (String valor){
        marca = valor;
    }
    public String getMarca (){
        return marca;
    }
    public void setModelo (String valor){
        modelo = valor;
    }
    public String getModelo (){
        return modelo;
    }
    public void setTipo(String valor){
        tipo = valor;
    }
    public String getTipo (){
        return tipo;
    }
    public void setAño (int valor){
        año = valor;
    }
    public int getAño (){
        return año;
    }
    public void setColor (String valor){
        color = valor;
    }
    public String getColor (){
        return color;
    }
    public void setPrecio (double valor){
        precio = valor;
    }
    public double getPrecio (){
        return precio;
    }
}
