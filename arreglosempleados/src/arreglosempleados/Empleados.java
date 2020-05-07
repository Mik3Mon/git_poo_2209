/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosempleados;

/**
 *
 * @author dmathews
 */
public class Empleados {
    private String nombre;
    private String departamento;
    private float salarioDiario;
    private int diasTrabajados;
    private int horasExtras;

    public Empleados() {
    }

    public Empleados(String nombre, String departamento, float salarioDiario, int diasTrabajados, int horasExtras) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salarioDiario = salarioDiario;
        this.diasTrabajados = diasTrabajados;
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(float salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public String toString() {
        String res = "Nombre: "+this.nombre+"\n";
        res = res + "Departamento: "+this.departamento+"\n";
        res = res + "Salario Diario: "+this.salarioDiario+"\n";
        res = res + "Dias trabajados al mes: "+this.diasTrabajados+"\n";
        res = res + "Horas extras: "+this.horasExtras+"\n";
        return res;
        
    }
    
    
}
