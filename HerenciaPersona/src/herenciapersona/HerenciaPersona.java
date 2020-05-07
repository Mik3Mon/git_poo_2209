/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersona;
import SuperClasePersona.Persona;
import HerenciasDeSupClase.Alumno;
import HerenciasDeSupClase.Empleado;
/**
 *
 * @author dmathews
 */
public class HerenciaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumn1=new Alumno("ICO", 3172814, "FES Aragon", 9.3f, "Miguel Angel Monzón Lucero", "IJMOF1831NCF", "02/02/2001", "Masculino");
        System.out.println(alumn1);
        
        Empleado empl1=new Empleado(15250.12f, "NAXIMH1", "Supervisor De Operaciones", "20/05/2026", "Miguel Angel Monzón Bautista", "MAXF881434MCM", "02/10/1975", "Masculino");
        System.out.println(empl1);
    }
    
}
