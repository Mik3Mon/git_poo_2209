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
public class Doble extends Accesos {
    private String dosCamasMatrimoniales;
    private float precio;

    public Doble() {
    }

    public Doble(String dosCamasMatrimoniales, float precio, String horariosDeEntrada, String horariosDeSalida, float tarifasPorNoche) {
        super(horariosDeEntrada, horariosDeSalida, tarifasPorNoche);
        this.dosCamasMatrimoniales = dosCamasMatrimoniales;
        this.precio = precio;
    }

    public String getDosCamasMatrimoniales() {
        return dosCamasMatrimoniales;
    }

    public void setDosCamasMatrimoniales(String dosCamasMatrimoniales) {
        this.dosCamasMatrimoniales = dosCamasMatrimoniales;
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
        res = res + "Cama: "+this.dosCamasMatrimoniales+"\n";
        res = res + "Precio: "+this.precio+"\n";
        return res;
    }
}
