/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Eventos.EventoDespedida;
import Eventos.EventoSaludo;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dmathews
 */
public class Saludo extends JFrame {
    private String titulo;
    private int alto;
    private int ancho;

    public Saludo() throws HeadlessException {
    }

    public Saludo(String titulo, int alto, int ancho) throws HeadlessException {
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        this.setTitle(titulo);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel tag = new JLabel("Escribe tu nombre");
        JTextField txt = new JTextField(20);
        JButton btn = new JButton("Saludar");
        JButton btn2 = new JButton("Despedir");
        cp.add(tag);
        cp.add(txt);
        cp.add(btn);
        cp.add(btn2);
        btn.addActionListener(new EventoSaludo(txt));
        btn2.addActionListener(new EventoDespedida(txt));
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
}
