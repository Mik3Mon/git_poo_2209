/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automovil;
import ClasesAuto.Chasis;
import ClasesAuto.Llanta;
import ClasesAuto.Motor;
/**
 *
 * @author dmathews
 */
public class Nissan {
    private String color;
    private String modelo;
    private Motor velocidad;
    private Llanta traccion;
    private Chasis peso1;
    private Chasis peso2;

    public Nissan() {
    }

    public Nissan(String color, String modelo, Motor velocidad, Llanta traccion, Chasis peso1, Chasis peso2) {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.traccion = traccion;
        this.peso1 = peso1;
        this.peso2 = peso2;
    }
    
     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public void encender(){
        System.out.println("Encnendiendo automovil modelo:"+this.modelo);
    }
    
    public void apagar(){
        System.out.println("Apagando automovil modelo:"+this.modelo);
    }

    public Motor getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Motor velocidad) {
        this.velocidad = velocidad;
    }

    public Llanta getTraccion() {
        return traccion;
    }

    public void setTraccion(Llanta traccion) {
        this.traccion = traccion;
    }

    public Chasis getPeso1() {
        return peso1;
    }

    public void setPeso1(Chasis peso1) {
        this.peso1 = peso1;
    }

    public Chasis getPeso2() {
        return peso2;
    }

    public void setPeso2(Chasis peso2) {
        this.peso2 = peso2;
    }

}
