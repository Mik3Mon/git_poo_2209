/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosempleados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author dmathews
 */
public class Arreglosempleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleados> lista = new ArrayList();
        lista.add(new Empleados("José García Pérez", "sistemas", 670f, 30, 5));
        lista.add(new Empleados("Diana Herrera Pérez", "recursos humanos", 450f, 25, 0));
        lista.add(new Empleados("Jessica Juarez Días", "ventas", 400f, 28, 0));
        lista.add(new Empleados("Pedro Paz Orozco", "ventas", 410f, 30, 0));
        lista.add(new Empleados("José Marcel Pérez", "sistemas", 680f, 29, 6));
        lista.add(new Empleados("Jesús Días García", "recursos humanos", 455f, 30, 0));
        lista.add(new Empleados("Pedro Xotla Ramirez", "sistemas", 675f, 27, 0));
        lista.add(new Empleados("Javier Medina Blanco", "ventas", 400f, 30, 4));
        lista.add(new Empleados("Elizabeth Villa Sosa", "sistemas", 670f, 30, 3));
        
        Iterator<Empleados> iterador = lista.iterator();
        int a;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("1.. Muestra la lista de empleados");
            System.out.println("2.. Muestra la lista de sueldos mensuales por empleado con su ganancia por horas extras, y total a pagar por sueldos y horas extras");
            System.out.println("3.. Muestra al empleado mas flojo");
            System.out.println("4.. Muestra al empleado con mas horas extras");
            a=scan.nextInt();            
        }while(a > 4||a < 1);
        
        switch(a) {
            case 1:
                System.out.println("\nLista de empleados");
                while (iterador.hasNext()) {
                    System.out.println( iterador.next());
                }
                break;
            case 2:
                System.out.println("\nSueldos mensuales por empleado con su ganancia por horas extras, y total a pagar por sueldos y horas extras ");
                int j=1;
                float total=0;
                do {
                    Empleados paga = iterador.next();
                    float m =(paga.getSalarioDiario()*paga.getDiasTrabajados());
                    float n =(paga.getHorasExtras()*85);
                    float t = m+n;
                    total=total+t;
                    System.out.println(paga.getNombre()+" "+m+" pesos"+" y "+n+" de horas extras");
                }while(iterador.hasNext());System.out.println("Total a pagar de sueldos y horas extras:"+total);
                break;
            case 3:
                System.out.println("\nEmpleado mas flojo");
                while (iterador.hasNext()) {
                    Empleados flojo = iterador.next();
                    if (flojo.getDiasTrabajados() > 25 ) {
                        iterador.remove();    
                    }
                    else {
                        System.out.println("Nombre: "+flojo.getNombre()+" "+flojo.getDiasTrabajados()+" dias");
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("\nEmpleado con mas horas extras");
                while (iterador.hasNext()) {
                    Empleados activo = iterador.next();
                    if (activo.getHorasExtras() < 6 ) {
                        iterador.remove();
                    }
                    else {
                        System.out.println("Nombre: "+activo.getNombre()+" "+activo.getHorasExtras()+" horas extras");
                        break;
                    }
                }
                break;
        }
    }
}
