/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;
import SmartPhone.SmartPhone;
/**
 *
 * @author dmathews
 */
public class Tarea1 {
    
    public static void mensajeDePorcentajeDeBateria() {
        SmartPhone smart3=new SmartPhone ("Apple",20,7500);
        System.out.println("Bateria Baja del smart3 "+smart3.getBateria()+"% Conecte el Dispositivo");
    }
    public static void coneccionWifi() {
        SmartPhone smart4=new SmartPhone();
        System.out.println("Wifi Encendido");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     SmartPhone smart1=new SmartPhone ();
     SmartPhone smart2=new SmartPhone ("Apple",100,25000);
        System.out.println("Marca smart1:"+smart1.getMarca());
        System.out.println("Marca smart2:"+smart2.getMarca());
        System.out.println("Porcentaje de Bateria smart2:"+smart2.getBateria()+"%");
        System.out.println("Precio smart2:"+smart2.getPrecio());
        mensajeDePorcentajeDeBateria();
        coneccionWifi();
    }   
}
