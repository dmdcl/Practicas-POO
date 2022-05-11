/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_11_throw;



/**
 *
 * @author invitado
 */
public class EVA3_11_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            throw new Exception("Mi excepcion!!!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
