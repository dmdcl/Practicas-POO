/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_16_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo triangulo = new Triangulo(10,15);
        Circulo circulo = new Circulo (10);
        Rectangulo rectangulo = new Rectangulo(19,15);
        //System.out.println("Area de un triangulo " + triangulo.calcularArea());
        imprimirArea(triangulo);
    }
    
     public static void imprimirArea(Figura f){
         System.out.println("Area = " + f.calcularArea());
     }
    
}

class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /*@Override
    public void calcularArea();
    return base * altura;
    */
    
}

class Circulo extends Figura{
    private double radio;

    public Circulo() {
        super();
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
     return (Math.pow(radio, radio));   
    }
    
    
    
}

//---------------IS A (todo es un)
class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return base * altura;
    }
    
}

class Figura{
    public double calcularArea(){
     return -1;   
    }
}