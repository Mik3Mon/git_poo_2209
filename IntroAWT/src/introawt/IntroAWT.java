/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introawt;

import ico.fes.poo.gui.Ventana;
import ico.fes.poo.gui.Ventana2;
import ico.fes.poo.gui.Ventana3;
import ico.fes.poo.gui.Ventana4;

/**
 *
 * @author dmathews
 */
public class IntroAWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ven1 = new Ventana("Hola Mundo GUI", 600, 400);
        ven1.setVisible(true);
        Ventana2 ven2 = new Ventana2("BorderLayout", 600, 400);
        ven2.setVisible(true);
        Ventana3 ven3 = new Ventana3("GridLayout", 600, 400);
        ven3.setVisible(true);
        Ventana4 ven4 = new Ventana4("GridBagLayout", 600, 400);
        ven4.setVisible(true);
    }   
    
}
