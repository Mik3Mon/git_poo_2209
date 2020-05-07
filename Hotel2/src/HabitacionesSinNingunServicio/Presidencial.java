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
public class Presidencial extends Accesos {
    private String recibidor;
    private String sala;
    private String bar;
    private String alberca;
    private String dosCamasKingSize;
    private float precio;

    public Presidencial() {
    }

    public Presidencial(String recibidor, String sala, String bar, String alberca, String dosCamasKingSize, float precio, String horariosDeEntrada, String horariosDeSalida, float tarifasPorNoche) {
        super(horariosDeEntrada, horariosDeSalida, tarifasPorNoche);
        this.recibidor = recibidor;
        this.sala = sala;
        this.bar = bar;
        this.alberca = alberca;
        this.dosCamasKingSize = dosCamasKingSize;
        this.precio = precio;
    }

    public String getRecibidor() {
        return recibidor;
    }

    public void setRecibidor(String recibidor) {
        this.recibidor = recibidor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getAlberca() {
        return alberca;
    }

    public void setAlberca(String alberca) {
        this.alberca = alberca;
    }

    public String getDosCamasKingSize() {
        return dosCamasKingSize;
    }

    public void setDosCamasKingSize(String dosCamasKingSize) {
        this.dosCamasKingSize = dosCamasKingSize;
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
        res = res + "Recibidor: "+this.recibidor+"\n";
        res = res + "Cama: "+this.dosCamasKingSize+"\n";
        res = res + "Alberca: "+this.alberca+"\n";
        res = res + "Bar: "+this.bar+"\n";
        res = res + "Sala: "+this.sala+"\n";
        res = res + "Precio: "+this.precio+"\n";
        return res;
    }
}
