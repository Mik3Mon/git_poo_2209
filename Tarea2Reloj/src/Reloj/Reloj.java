/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

/**
 *
 * @author dmathews
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public void mostrarHora(){
        aumentarSegundo();
    }
    
    public void aumentarSegundo() {
        while(segundo<60) {
            System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
            segundo++;
        }
        segundo=0;
        minuto++;
        aumentarMinuto();
    }
    
    public void aumentarMinuto() {
        while(minuto<60) {
            aumentarSegundo();
        }
        minuto=0;
        hora++;
        aumentarHora();
    }
    
    public void aumentarHora() {
        if(hora==25) {
            reset();
        }
        aumentarSegundo();
    }
    
    public void reset() {
        hora=0;
        minuto=0;
        segundo=0;
    }
}


