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
    float num1;
    float num2;
    float num3;
    float num4;
    float num5;
    float num6;

    public Promedio() {
    }

    public Promedio(float num1, float num2, float num3, float num4, float num5, float num6) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }
    
    public float Sum() {
        return getNum1()+getNum2()+getNum3()+getNum4()+getNum5()+getNum6();
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

    public float getNum3() {
        return num3;
    }

    public void setNum3(float num3) {
        this.num3 = num3;
    }

    public float getNum4() {
        return num4;
    }

    public void setNum4(float num4) {
        this.num4 = num4;
    }

    public float getNum5() {
        return num5;
    }

    public void setNum5(float num5) {
        this.num5 = num5;
    }

    public float getNum6() {
        return num6;
    }

    public void setNum6(float num6) {
        this.num6 = num6;
    }
    
    
}
