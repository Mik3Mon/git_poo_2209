/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservaciones;
import Reservaciones.NumeroDeReservaciones;

/**
 *
 * @author dmathews
 */
public class Registro extends NumeroDeReservaciones {
    private String habitacion;
    private int numeroDeDias;
    private float precioFinal;

    public Registro() {
    }

    public Registro(String habitacion, int numeroDeDias, float precioFinal, int numeroDeReservaciones) {
        super(numeroDeReservaciones);
        this.habitacion = habitacion;
        this.numeroDeDias = numeroDeDias;
        this.precioFinal = precioFinal;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getNumeroDeDias() {
        return numeroDeDias;
    }

    public void setNumeroDeDias(int numeroDeDias) {
        this.numeroDeDias = numeroDeDias;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    @Override
    public String toString() {
        String res = super.toString();
        res = res + "Habitacion: "+this.habitacion+"\n";
        res = res + "Numero de dias: "+this.numeroDeDias+"\n";
        res = res + "Total por reservacion: "+this.precioFinal+"\n";    
        return res;
    }
}
