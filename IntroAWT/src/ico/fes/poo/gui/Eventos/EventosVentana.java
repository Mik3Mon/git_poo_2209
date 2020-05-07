/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.Eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author dmathews
 */
public class EventosVentana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Evento Opened");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Evento Closing");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Evento Closed");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Evento Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Evento deiconified");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Evento Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Evento Deactivated");
    }
    
}
