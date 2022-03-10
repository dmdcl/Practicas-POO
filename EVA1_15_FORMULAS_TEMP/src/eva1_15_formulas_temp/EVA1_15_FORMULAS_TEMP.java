/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputC = new Scanner(System.in);
        System.out.println("Introduce los grados centigrados: ");
        double celcius= inputC.nextDouble();
        double farenheit = Conversiones.convertirCaF(celcius);
        System.out.println(celcius + "°C = " + farenheit + "°F");
        double kelvin = Conversiones.convertirCaK(celcius);
        System.out.println(celcius + "°C = " + kelvin + "°K");
        
        Scanner inputF = new Scanner(System.in);
        System.out.println("Introduce los grados farenheit:");
        double farenheit2 = inputF.nextDouble();
        double celcius2 = Conversiones.convertirFaC(farenheit2);
        System.out.println(farenheit2 + "°F = " + celcius2 + "°C");
        double kelvin2 = Conversiones.convertirFaK(farenheit2);
        System.out.println(farenheit2 + "°F = " + kelvin2 + "°K");
        
        Scanner inputK = new Scanner(System.in);
        System.out.println("Introduce los grados Kelvvin");
        double kelvin3 = inputK.nextDouble();
        double farenheit3 = Conversiones.convertirKaF(kelvin3);
        System.out.println(kelvin3 + "°K = " + farenheit3 + "°F");
        double celcius3 = Conversiones.convertirKaC(kelvin3);
        System.out.println(kelvin3 + "°K = " + celcius3 + "°C");
    }
    
}

class Conversiones{
    
    public static double convertirCaF(double celcius){
        return celcius * 1.8 + 32;
    }
    public static double convertirCaK(double celcius){
        return celcius + 273.15;
    }
    public static double convertirFaC(double farenheit2){
        return (farenheit2 -32) / 1.8;
    }
    public static double convertirFaK(double farenheit2){
        return (farenheit2 -32) * 5/9 + 273.15;
    }
    public static double convertirKaF(double kelvin3){
        return (kelvin3-273.15) * 9/5 + 32;
    }
    public static double convertirKaC(double kelvin3){
        return kelvin3 - 273.15;
    }
}