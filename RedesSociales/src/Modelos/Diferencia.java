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
public class Diferencia {
    private float num1;
    private float num2;
    private float res;

    public Diferencia() {
    }

    public Diferencia(float num1, float num2, float res) {
        this.num1 = num1;
        this.num2 = num2;
        this.res = res;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }
    
    
    
}
