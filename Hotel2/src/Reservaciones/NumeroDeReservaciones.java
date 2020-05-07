/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservaciones;

/**
 *
 * @author dmathews
 */
public class NumeroDeReservaciones {
    private int numeroDeReservaciones;

    public NumeroDeReservaciones() {
    }

    public NumeroDeReservaciones(int numeroDeReservaciones) {
        this.numeroDeReservaciones = numeroDeReservaciones;
    }

    public int getNumeroDeReservaciones() {
        return numeroDeReservaciones;
    }

    public void setNumeroDeReservaciones(int numeroDeReservaciones) {
        this.numeroDeReservaciones = numeroDeReservaciones;
    }
    
    @Override
    public String toString() {
        String res = "Numero de Reservaciones: "+this.numeroDeReservaciones+"\n";
        return res;
    }
}
