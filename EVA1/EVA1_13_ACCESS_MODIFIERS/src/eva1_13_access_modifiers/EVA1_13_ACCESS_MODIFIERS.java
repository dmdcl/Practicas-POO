/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_access_modifiers;

import VEHICULOS_SIN_MOTOR.Bicicletas;

/**
 *
 * @author user
 */
public class EVA1_13_ACCESS_MODIFIERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miCarro = new Automovil();
        miCarro.setAño(2003);
        miCarro.imprimirmensaje();
        Bicicletas miBici = new Bicicletas();
        Carreta miCarreta = new Carreta();
    }
    
}
