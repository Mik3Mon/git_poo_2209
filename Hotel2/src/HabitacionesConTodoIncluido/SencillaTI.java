/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HabitacionesConTodoIncluido;
import HabitacionesSinNingunServicio.Sencilla;

/**
 *
 * @author dmathews
 */
public class SencillaTI extends Sencilla {
    private String servicioALaHbitacion;
    private String accesoAlRestauranteBar;
    private String accesoALosConciertosYEspectaculos;
    private String pulseraParaBarraLibre24Hrs;

    public SencillaTI() {
    }

    public SencillaTI(String servicioALaHbitacion, String accesoAlRestauranteBar, String accesoALosConciertosYEspectaculos, String pulseraParaBarraLibre24Hrs, String camaMatrimonial, float precio, String horariosDeEntrada, String horariosDeSalida, float tarifasPorNoche) {
        super(camaMatrimonial, precio, horariosDeEntrada, horariosDeSalida, tarifasPorNoche);
        this.servicioALaHbitacion = servicioALaHbitacion;
        this.accesoAlRestauranteBar = accesoAlRestauranteBar;
        this.accesoALosConciertosYEspectaculos = accesoALosConciertosYEspectaculos;
        this.pulseraParaBarraLibre24Hrs = pulseraParaBarraLibre24Hrs;
    }

    public String getServicioALaHbitacion() {
        return servicioALaHbitacion;
    }

    public void setServicioALaHbitacion(String servicioALaHbitacion) {
        this.servicioALaHbitacion = servicioALaHbitacion;
    }

    public String getAccesoAlRestauranteBar() {
        return accesoAlRestauranteBar;
    }

    public void setAccesoAlRestauranteBar(String accesoAlRestauranteBar) {
        this.accesoAlRestauranteBar = accesoAlRestauranteBar;
    }

    public String getAccesoALosConciertosYEspectaculos() {
        return accesoALosConciertosYEspectaculos;
    }

    public void setAccesoALosConciertosYEspectaculos(String accesoALosConciertosYEspectaculos) {
        this.accesoALosConciertosYEspectaculos = accesoALosConciertosYEspectaculos;
    }

    public String getPulseraParaBarraLibre24Hrs() {
        return pulseraParaBarraLibre24Hrs;
    }

    public void setPulseraParaBarraLibre24Hrs(String pulseraParaBarraLibre24Hrs) {
        this.pulseraParaBarraLibre24Hrs = pulseraParaBarraLibre24Hrs;
    }
    
    @Override
    public String toString() {
        String res = super.toString();
        res = res +"Servicio a la Habitacion: "+this.servicioALaHbitacion+"\n";
        res = res +"Acceso al Restaurante-Bar: "+this.accesoAlRestauranteBar+"\n";
        res = res +"Accesos a los Conciertos y Espectaculos dentro del Hotel: "+this.accesoALosConciertosYEspectaculos+"\n";
        res = res +"Pulsera para Barra Libre 24hrs: "+this.pulseraParaBarraLibre24Hrs+"\n";
        return res;
    }
}
