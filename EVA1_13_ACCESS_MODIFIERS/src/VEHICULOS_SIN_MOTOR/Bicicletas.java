/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VEHICULOS_SIN_MOTOR;

/**
 *
 * @author user
 */
public class Bicicletas {
    private int rodada;
    private String marca;
    private double precio;

    public int getRodada() {
        //miCarro. no puede usar metodo default imprimirMensaje();
        //Carreta miCarreta = new Carreta(); NO PODEMOS VER ESTA CLASE ES DEFAULT, ESTA EN OTRO PAQUETE
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
