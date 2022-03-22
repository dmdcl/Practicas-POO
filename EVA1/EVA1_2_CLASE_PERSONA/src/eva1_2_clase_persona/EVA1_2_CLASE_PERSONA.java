/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clase_persona;

/**
 *
 * @author user
 */
public class EVA1_2_CLASE_PERSONA {//declaración

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//declaración
        // TODO code application logic here
        //implementación
        System.out.println("Hola Mundo!");
        //COMO CREAR UN OBJETO EN JAVA.
        //INSTANCIACION: CREAR UN OBJETO
        //DAR MEMORIA JAVA --> new || C++ --> new, malloc
        //declarar            //construir
        Persona estudiante = new Persona();//declaro una variable (objeto) tipo Persona
        estudiante.id = "21550321";
        estudiante.nombre = "Diego Martin del Campo";
        estudiante.edad = 18;
        estudiante.imprimirDatos();
        //CONCATENACION -> PEGAR CADENAS DE TEXTO 
        // "  " + ENTERO/ BOOLEANO/STRING/DOUBLE/ETC --> CADENA DE TEXTO
        System.out.println("Año de nacimiento " + estudiante.calcularAñoNacimiento());
        
        Persona estudiante2 = new Persona();
        estudiante2.nombre = "Dirgo";
        estudiante2.id = "21550322";
        estudiante2.edad = 18;
        estudiante2.imprimirDatos();
        estudiante2.calcularAñoNacimiento();
        System.out.println("Año de nacimiento " + estudiante2.calcularAñoNacimiento());
        
        Persona estudiante3 = new Persona();
        estudiante3.nombre = "Topti";
        estudiante3.id = "21550323";
        estudiante3.edad = 17;
        estudiante3.imprimirDatos();
        estudiante3.calcularAñoNacimiento();
        System.out.println("Año de nacimiento " + estudiante3.calcularAñoNacimiento());
   }
  
}

//UNA CLASE ES UN TIPO DE DATO ABSTRACTO
class Persona//declaración
{//implementación 
    //ATRIBUTOS DE LA CLASE
    String id;
    String nombre;
    int edad;
    
    //COMPORTAMIENTO
    //metodo imprimir datos     >metodo/funcion > f(3) = 3 x + 1
    //valor de retorno + nombre de la funcion ( argumentos );
    void imprimirDatos(){//no regresa valor, el nombre es imprimirDatos(no recibe valores)
        System.out.println("El nombre es: " + nombre);
        System.out.println("Su ID es: " + id);
        System.out.println("Su edad es: "  + edad);
    }
    
    //calcular año nacimiento
    double calcularAñoNacimiento(){
        int añoNac = 2022 - edad;
        return añoNac;
    }
}