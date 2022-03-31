/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_herencia_3;

/**
 *
 * @author user
 */
public class EVA2_3_HERENCIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        //Animal animal = new Animal();
        //animal.mover();
        //Vertebrado verte = new Vertebrado();
        //verte.tenerEsqueleto();
        //Mamifero mamifero = new Mamifero();
        //mamifero.tenerPelo();
        //Primates primate = new Primates();
        //primate.agarrarObjetos();
        Humano humano = new Humano();
        humano.pensar();
    }
    
}

class Humano extends Primates{
    public Humano(){
        super();
        System.out.println("HUMANO");
    }
    
    public void pensar(){
        System.out.println("PENSAR");
    }
}

class Primates extends Mamifero{
    public Primates(){
        super();
        System.out.println("PRIMATES");
    }
    
    public void agarrarObjetos(){
        System.out.println("SUJETAR OBJETOS");
    }
}

class Mamifero extends Vertebrado{
    public Mamifero(){
        super();
        System.out.println("MAMIFERO");
    }
    
    public void tenerPelo(){
        System.out.println("TENER PELO");
    }
}

class Vertebrado extends Animal{
    public Vertebrado(){
        super();
        System.out.println("VERTEBRADO");
    }
    
    public void tenerEsqueleto(){
        System.out.println("VERTEBRADO: tiene esqueleto");
    }
}

class Animal{
    public Animal(){
        System.out.println("ANIMAL");
    }
    
    public void mover(){
        System.out.println("ANIMAL: movimiento");
    }
}