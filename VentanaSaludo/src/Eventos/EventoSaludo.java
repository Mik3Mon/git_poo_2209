/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dmathews
 */
public class EventoSaludo implements ActionListener {
    private JTextField cuadrotxt;

    public EventoSaludo() {
    }

    public EventoSaludo(JTextField cuadrotxt) {
        this.cuadrotxt = cuadrotxt;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hola, " + cuadrotxt.getText() + "!");
    }
    
}
