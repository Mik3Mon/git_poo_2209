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
public class Alumno extends Persona {
   private String carrera;
   private int numcuenta;
   private String facultad;
   private float promedio;

    public Alumno() {
    }

    public Alumno(String carrera, int numcuenta, String facultad, float promedio, String nombre, String curp, String fechaDeNacimiento, String sexo) {
        super(nombre, curp, fechaDeNacimiento, sexo);
        this.carrera = carrera;
        this.numcuenta = numcuenta;
        this.facultad = facultad;
        this.promedio = promedio;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    public void estudiar() {
        System.out.println("El alumno esta estudaindo..");
    }
    
    public void hacerTarea() {
        System.out.println("El alumno esta haciendo tarea..");
    }
    
    public int extras() {
        System.out.println("El alumno con numero de cuenta "+this.numcuenta+"presento la siguiente cantidad de extras..");
        return 3;
    }
    
    public float promedio() {
        System.out.println("Este fue el promedio anterior del alumno con numero de cuenta"+this.numcuenta);
        return (float) 9.3;
    }
    
   @Override
    public String toString() {
       String res = super.toString();
       res = res + "Facultad:"+this.facultad+"\n";
       res = res + "Carrera:"+this.carrera+"\n";
       res = res + "Numero De Cuenta:"+this.numcuenta+"\n";
       res = res + "Promedio:"+this.promedio+"\n";
       
       return res;
    }
}
