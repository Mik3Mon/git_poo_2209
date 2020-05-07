/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitaciones;

/**
 *
 * @author dmathews
 */
public class Accesos {
    private String horariosDeEntrada;
    private String horariosDeSalida;
    private float tarifasPorNoche;

    public Accesos() {
    }

    public Accesos(String horariosDeEntrada, String horariosDeSalida, float tarifasPorNoche) {
        this.horariosDeEntrada = horariosDeEntrada;
        this.horariosDeSalida = horariosDeSalida;
        this.tarifasPorNoche = tarifasPorNoche;
    }

    public String getHorariosDeEntrada() {
        return horariosDeEntrada;
    }

    public void setHorariosDeEntrada(String horariosDeEntrada) {
        this.horariosDeEntrada = horariosDeEntrada;
    }

    public String getHorariosDeSalida() {
        return horariosDeSalida;
    }

    public void setHorariosDeSalida(String horariosDeSalida) {
        this.horariosDeSalida = horariosDeSalida;
    }

    public float getTarifasPorNoche() {
        return tarifasPorNoche;
    }

    public void setTarifasPorNoche(float tarifasPorNoche) {
        this.tarifasPorNoche = tarifasPorNoche;
    }
    
    @Override
    public String toString() {
        String res = "Hora de Entrada: "+this.horariosDeEntrada+"\n";
        res = res + "Hora de Salida: "+this.horariosDeSalida+"\n";
        res = res + "Tarifa por Noche "+this.tarifasPorNoche+"\n";
        return res;
    }
}
