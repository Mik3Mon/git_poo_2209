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
public class Flauta extends Instrumento {
    private String tipoDeFlauta;

    public Flauta() {
    }

    public Flauta(String tipoDeFlauta, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.tipoDeFlauta = tipoDeFlauta;
    }
    
    public String getTipoDeFlauta() {
        return tipoDeFlauta;
    }

    public void setTipoDeFlauta(String tipoDeFlauta) {
        this.tipoDeFlauta = tipoDeFlauta;
    }
        
    @Override
    public void afinar() {
        System.out.println("Has un soplido fuerte..");
        System.out.println("Repetir hasta que se escuche bien...");
        
    }

    @Override
    public void tocar() {
        System.out.println("Suena el concierto de Calamardo");
        
    }
    
}
