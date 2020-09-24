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
public class Promedio {
    private float v1;
    private float v2;
    private float v3;
    private float v4;
    private float v5;
    private float v6;
    private float prom;

    public Promedio() {
    }

    public Promedio(float v1, float v2, float v3, float v4, float v5, float v6, float prom) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
        this.v6 = v6;
        this.prom = prom;
    }

    public float getV1() {
        return v1;
    }

    public void setV1(float v1) {
        this.v1 = v1;
    }

    public float getV2() {
        return v2;
    }

    public void setV2(float v2) {
        this.v2 = v2;
    }

    public float getV3() {
        return v3;
    }

    public void setV3(float v3) {
        this.v3 = v3;
    }

    public float getV4() {
        return v4;
    }

    public void setV4(float v4) {
        this.v4 = v4;
    }

    public float getV5() {
        return v5;
    }

    public void setV5(float v5) {
        this.v5 = v5;
    }

    public float getV6() {
        return v6;
    }

    public void setV6(float v6) {
        this.v6 = v6;
    }

    public float getProm() {
        return prom;
    }

    public void setProm(float prom) {
        this.prom = prom;
    }
    
}
