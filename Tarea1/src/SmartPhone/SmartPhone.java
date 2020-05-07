/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartPhone;

/**
 *
 * @author dmathews
 */
public class SmartPhone {
    
    private String marca;
    private int bateria;
    private float precio;

    public SmartPhone() {
    }

    public SmartPhone(String marca, int bateria, float precio) {
        this.marca = marca;
        this.bateria = bateria;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
