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
public class Suite extends Accesos {
    private String miniBar;
    private String jacuzzi;
    private String camaKingSize;
    private float precio;

    public Suite() {
    }

    public Suite(String miniBar, String jacuzzi, String camaKingSize, float precio, String horariosDeEntrada, String horariosDeSalida, float tarifasPorNoche) {
        super(horariosDeEntrada, horariosDeSalida, tarifasPorNoche);
        this.miniBar = miniBar;
        this.jacuzzi = jacuzzi;
        this.camaKingSize = camaKingSize;
        this.precio = precio;
    }

    public String getMiniBar() {
        return miniBar;
    }

    public void setMiniBar(String miniBar) {
        this.miniBar = miniBar;
    }

    public String getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(String jacuzzi) {
        this.jacuzzi = jacuzzi;
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
        res = res + "Cama : "+this.camaKingSize+"\n";
        res = res + "Jacuzzi: "+this.jacuzzi+"\n";
        res = res + "Mini Bar: "+this.miniBar+"\n";
        res = res + "Precio: "+this.precio+"\n";
        return res;
    }
}
