/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
//3 x 2 -> 9
/**
 *
 * @author dmathews
 */
public class BuscaMinas extends JFrame {
    public static final int REN=3;
    public static final int COL=3;
    
    private ArrayList<BotonBuscaMinas> cuadricula;

    public BuscaMinas() throws HeadlessException {
        super("Buscaminas patito v0.1.0");
        super.setSize(300, 300);
        //super.setLayout(new GridLayout(REN, COL));
        this.getContentPane().setLayout(new GridLayout(REN, COL));
        cuadricula = new ArrayList();
        int Total = REN * COL;
        for (int i = 0; i < Total; i++) {
            cuadricula.add(new BotonBuscaMinas(true));
            this.getContentPane().add(cuadricula.get(i), i);   
        }
    }
    
}
