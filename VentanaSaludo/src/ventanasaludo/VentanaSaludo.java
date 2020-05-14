/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasaludo;

import Ventanas.Saludo;

/**
 *
 * @author dmathews
 */
public class VentanaSaludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Saludo sal1 = new Saludo("Ventana Saludo", 600, 400);
        sal1.setVisible(true);
    }
    
}
