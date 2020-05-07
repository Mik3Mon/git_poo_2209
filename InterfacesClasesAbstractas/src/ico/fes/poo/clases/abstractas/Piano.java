/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clases.abstractas;

/**
 *
 * @author dmathews
 */
public class Piano extends Instrumento {
    private String tipoDePiano;

    public Piano() {
    }

    public Piano(String tipoDePiano, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.tipoDePiano = tipoDePiano;
    }

    public String getTipoDePiano() {
        return tipoDePiano;
    }

    public void setTipoDePiano(String tipoDePiano) {
        this.tipoDePiano = tipoDePiano;
    }

    @Override
    public void afinar() {
        System.out.println("Presiona cada tecla hasta que se escuchen en una misma armonia");
        System.out.println("Repetir hasta que se escuche bien");
        
    }

    @Override
    public void tocar() {
        System.out.println("Suena Cuatro estaciones de Vivaldi");
        
    }
    
}
