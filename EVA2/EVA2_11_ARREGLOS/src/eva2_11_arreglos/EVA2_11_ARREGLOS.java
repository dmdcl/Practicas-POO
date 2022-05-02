/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arreglos;

/**
 *
 * @author user
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLOS
        //FILA O COLUMNA DE EXCEL
        //ALMACENAN DATOS DEL MISMO TIPO
        //SE PUEDEN ACCEDER POR INDICES
        //JAVA: PRIMER POSICION --> 0, ULTIMA CANTIDAD DE EEMENTOS -1
        //JAVA: LOS ARREGLOS SON OBJETOS
        int [] arreglo = new int[10];//arreglo con 10 enteros
        //¿como los usamos?
        arreglo[0] = 100;//el arreglo en la posicion 0, se le asigna 100
        System.out.println("El valor de arreglo [0] = " + arreglo[0]);
        arreglo[1] = 200;
        arreglo[2] = 200;
        arreglo[3] = 200;
        arreglo[4] = 200;
        arreglo[5] = 200;
        arreglo[6] = 200;
        arreglo[7] = 200;
        arreglo[8] = 200;
        arreglo[9] = 1000; //ultima poisicion 
        System.out.println("Tamaño del arreglo: " + arreglo.length);
        System.out.println(arreglo);
        //arreglo[10] = 200;//aqui nos pasamos del arreglo
        String [] arreCade = new String [10];
        arreCade[5] = "Hola mundo";
        double [] arreDouble = new double[1000000];
        arreDouble [999999] = 0.2;
        Persona[] clasePOO = new Persona [32];//arreglo para 32 objetos de tipo Persona
    }
    
}

class Persona{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}