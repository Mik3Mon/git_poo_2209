/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAuto;

/**
 *
 * @author dmathews
 */
public class Llanta {
    private String marca;
    private float dimensiones;
    private String propiedades;

    public Llanta() {
    }

    public Llanta(String marca, float dimensiones, String propiedades) {
        this.marca = marca;
        this.dimensiones = dimensiones;
        this.propiedades = propiedades;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(String propiedades) {
        this.propiedades = propiedades;
    }
    
    public void girar() {
        
    }
}
