/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_static;

/**
 *
 * @author user
 */
public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIAR LA CLASE
        /*
        FormulasMatematicas MisFor = new FormulasMatematicas();
        double area = MisFor.calcularAreaCirculo(100);
        System.out.println("Area del circulo " + area);*/
        double area = FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area del circulo " + area);
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area del triangulo " + areaT);
        FormulasMatematicas miObj = new FormulasMatematicas();
        miObj.imprimirMensaje();
        
    }
    
}

class FormulasMatematicas{
    static int valor = 100;
    //area circulo:
    public static double calcularAreaCirculo(double radio){
        double area;
        area = 3.1416 * radio * radio;
        return area;
    }
    //area triangulo
    public static double calcularAreaTriangulo (double base, double altura){
        double area;
        area = (base * altura) / 2.0;
        return area;
    }
    
    public void imprimirMensaje(){
        System.out.println("Hola mundo!");
    }
}