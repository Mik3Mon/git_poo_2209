/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3Composicion;
import Automovil.Nissan;
import ClasesAuto.Motor;
/**
 *
 * @author dmathews
 */
public class Tarea3Composicion {
    
    public static void main(String[] args) {
        
        Nissan niss1=new Nissan();
        niss1.setModelo("Sentra");
        niss1.setVelocidad(new Motor("1.6L","188hp",true));
        
        //Cambia si tiene turbo
        //niss1.getVelocidad().setTurbo(false);
        //Para comprobar el funcionamiento del codigo, correr una vez asi, y la segundaa vez borran las diagonales de la linea de codigo anterior
        if (niss1.getVelocidad().isTurbo()) { 
        System.out.println("Nuevo Nissan "+niss1.getModelo()+" Con motor "+niss1.getVelocidad().getLitros()+" Turbo"+ " Con "+niss1.getVelocidad().getCaballosFuerza());
        }
        else {
        System.out.println("Nuevo Nissan "+niss1.getModelo()+" Con motor "+niss1.getVelocidad().getLitros()+" Con "+niss1.getVelocidad().getCaballosFuerza());
        }   
    }

}