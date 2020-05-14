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
public class EventoDespedida implements ActionListener {
    private JTextField cuadrotxt;

    public EventoDespedida() {
    }

    public EventoDespedida(JTextField cuadrotxt) {
        this.cuadrotxt = cuadrotxt;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Adios, " + cuadrotxt.getText() + "!");
    }
    
}
