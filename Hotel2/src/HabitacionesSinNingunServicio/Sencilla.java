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
public class Sencilla extends Accesos {
    private String camaMatrimonial;
    private float precio;

    public Sencilla() {
    }

    public Sencilla(String camaMatrimonial, float precio, String horariosDeEntrada, String horariosDeSalida, float tarifasPorNoche) {
        super(horariosDeEntrada, horariosDeSalida, tarifasPorNoche);
        this.camaMatrimonial = camaMatrimonial;
        this.precio = precio;
    }

    public String getCamaMatrimonial() {
        return camaMatrimonial;
    }

    public void setCamaMatrimonial(String camaMatrimonial) {
        this.camaMatrimonial = camaMatrimonial;
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
        res = res + "Cama: "+this.camaMatrimonial+"\n";
        res = res + "Precio: "+this.precio+"\n";
        return res;
    }
}
