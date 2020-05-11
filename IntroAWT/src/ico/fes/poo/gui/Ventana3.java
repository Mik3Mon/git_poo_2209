/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.Eventos.EventosVentana;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;

/**
 *
 * @author dmathews
 */
public class Ventana3 extends Frame {
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    

    public Ventana3() throws HeadlessException {
    }

    public Ventana3(String titulo, int alto, int ancho) throws HeadlessException {
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        this.setTitle(titulo);
        boton1 = new Button("Presioname 1");
        boton2 = new Button("Presioname 2");
        boton3 = new Button("Presioname 3");
        boton4 = new Button("Presioname 4");
        this.setLayout(new GridLayout(3,2));
        this.add(boton1,0);
        this.add(boton2,1);
        this.add(boton3,2);
        this.add(boton4,3);
        this.addWindowListener(new EventosVentana());
        
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
