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
public class Pruebas {
    public static void main(String[] args) {
        Guitarra g = new Guitarra(6, 1967, "Yamaha");
        System.out.println(g.getAnioConstruccion());
        g.afinar();
        g.tocar();
        
        Piano p = new Piano("Electrico", 2010, "Yamaha");
        System.out.println(p.getAnioConstruccion());
        p.afinar();
        p.tocar();
        
        Flauta f = new Flauta("Dulce Soprano", 2018, "Yamaha");
        System.out.println(f.getAnioConstruccion());
        f.afinar();
        f.tocar();
    }
    
}
