/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HabitacionesSinNingunServicio;
import Habitaciones.Accesos;

/**
 *
 * @author dmathews
 */
public class King extends Accesos {
    private String sala;
    private String miniBar;
    private String alberca;
    private String camaKingSize;
    private float precio;

    public King() {
    }

    public King(String sala, String miniBar, String alberca, String camaKingSize, float precio, String horariosDeEntrada, String horariosDeSalida, float tarifasPorNoche) {
        super(horariosDeEntrada, horariosDeSalida, tarifasPorNoche);
        this.sala = sala;
        this.miniBar = miniBar;
        this.alberca = alberca;
        this.camaKingSize = camaKingSize;
        this.precio = precio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getMiniBar() {
        return miniBar;
    }

    public void setMiniBar(String miniBar) {
        this.miniBar = miniBar;
    }

    public String getAlberca() {
        return alberca;
    }

    public void setAlberca(String alberca) {
        this.alberca = alberca;
    }

    public String getCamaKingSize() {
        return camaKingSize;
    }

    public void setCamaKingSize(String camaKingSize) {
        this.camaKingSize = camaKingSize;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
        
    @Override
    public String toString() {
        String res = super.toString();
        res = res + "Cama: "+this.camaKingSize+"\n";
        res = res + "Alberca: "+this.alberca+"\n";
        res = res + "Mini Bar: "+this.miniBar+"\n";
        res = res + "Sala: "+this.sala+"\n";
        res = res + "Precio: "+this.precio+"\n";
        return res;
    }
}
