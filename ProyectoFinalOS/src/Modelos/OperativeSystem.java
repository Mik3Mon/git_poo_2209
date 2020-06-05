/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author dmathews
 */
public class OperativeSystem {
    private String nombre;
    private String arquitectura;
    private String versionKernel;
    private String licencia;
    private String multiusuario;
    private String multitareas;

    public OperativeSystem() {
    }

    public OperativeSystem(String nombre, String arquitectura, String versionKernel, String licencia, String multiusuario, String multitareas) {
        this.nombre = nombre;
        this.arquitectura = arquitectura;
        this.versionKernel = versionKernel;
        this.licencia = licencia;
        this.multiusuario = multiusuario;
        this.multitareas = multitareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getVersionKernel() {
        return versionKernel;
    }

    public void setVersionKernel(String versionKernel) {
        this.versionKernel = versionKernel;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getMultiusuario() {
        return multiusuario;
    }

    public void setMultiusuario(String multiusuario) {
        this.multiusuario = multiusuario;
    }

    public String getMultitareas() {
        return multitareas;
    }

    public void setMultitareas(String multitareas) {
        this.multitareas = multitareas;
    }
    
    @Override
    public String toString() {
        return "OperativeSystem{" + "nombre=" + nombre + ", arquitectura=" + arquitectura + ", versionKernel=" + versionKernel + ", licencia=" + licencia + ", multiusuario=" + multiusuario + ", multitareas=" + multitareas + '}';
    }
}
