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
public class Chasis {
   private String material;
   private float dimensiones;
   private String provedor;

    public Chasis() {
    }

    public Chasis(String material, float dimensiones, String provedor) {
        this.material = material;
        this.dimensiones = dimensiones;
        this.provedor = provedor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
    
    public void sostenerMotor() {
        
    }
}
