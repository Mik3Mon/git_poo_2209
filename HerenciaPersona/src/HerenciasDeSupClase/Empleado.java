/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciasDeSupClase;

import SuperClasePersona.Persona;

/**
 *
 * @author dmathews
 */
public class Empleado extends Persona {
    private float salario;
    private String rfc;
    private String puesto;
    private String añoDeIngreso;

    public Empleado() {
    }

    public Empleado(float salario, String rfc, String puesto, String añoDeIngreso, String nombre, String curp, String fechaDeNacimiento, String sexo) {
        super(nombre, curp, fechaDeNacimiento, sexo);
        this.salario = salario;
        this.rfc = rfc;
        this.puesto = puesto;
        this.añoDeIngreso = añoDeIngreso;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(String añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }
    
    public void entregarReportes() {
        System.out.println("Entregando Reportes..");
    }
    
    public void calentarComida() {
        System.out.println("Calentando Comida..");
    }
    
    public int aumento() {
        System.out.println("El emleado recio un aumento de..");
        return 10000;
    }
    
    public float descuento() {
        System.out.println("El empleado tuvo un descuento por faltar..");
        return 2100;
    }
    
    @Override
    public String toString() {
        String res = super.toString();
        res = res +"Salario:"+this.salario+" pesos\n";
        res = res +"Puesto:"+this.puesto+"\n";
        res = res +"RFC:"+this.rfc+"\n";
        res = res +"Año de Ingreso:"+this.añoDeIngreso+"\n";
        
        return res;
    }
    
}
