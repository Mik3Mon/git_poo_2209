/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel2;
import HabitacionesSinNingunServicio.Sencilla;
import HabitacionesSinNingunServicio.Doble;
import HabitacionesSinNingunServicio.Suite;
import HabitacionesSinNingunServicio.King;
import HabitacionesSinNingunServicio.Presidencial;
import HabitacionesConTodoIncluido.SencillaTI;
import HabitacionesConTodoIncluido.DobleTI;
import HabitacionesConTodoIncluido.SuiteTI;
import HabitacionesConTodoIncluido.KingTI;
import HabitacionesConTodoIncluido.PresidencialTI;
import Reservaciones.Registro;

/**
 *
 * @author dmathews
 */
public class Hotel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui se muestran como es que aparecerian las opciones de reservacion que ofrece nuestro hotel.
        //Esto aparece como si fuera una clase de interfaz de seleccion de una pagina o aplicacion.
        System.out.println("Habitaciones Sin Servicios"+"\n");
        
        Sencilla hab1 = new Sencilla("1 Cama Matrimonial", 1600f, "15:00 hrs", "00:00 hrs", 600f);
        System.out.println("Sencilla "+"\n"+hab1+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        Doble hab2 = new Doble("2 Camas Matrimoniales", 2560f, "15:00 hrs", "00:00 hrs", 800f);
        System.out.println("Doble "+"\n"+hab2+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        Suite hab3 = new Suite("Incluye", "Incluye", "1 Cama KingSize", 4890f, "15:00 hrs", "00:00 hrs", 1000f);
        System.out.println("Suite "+"\n"+hab3+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        King hab4 = new King("Inlcuye", "Incluye", "Incluye", "1 Cama KingSize", 6250f, "15:00 hrs", "00:00 hrs", 1200f);
        System.out.println("King "+"\n"+hab4+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        Presidencial hab5 = new Presidencial("Incluye", "Incluye", "Incluye", "Incluye", "2 Camas KingSize", 8100f, "15:00 hrs", "00:00 hrs", 1400f);
        System.out.println("Presidencial "+"\n"+hab5+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        System.out.println("Habitaciones Con Todo Incluido"+"\n");
        
        SencillaTI hab6 = new SencillaTI("Incluye", "Incluye", "Incluye", "Incluye", "1 Cama Mtrimonial", 2200f, "15:00 hrs", "00:00 hrs", 800f);
        System.out.println("Sencilla Todo Incluido "+"\n"+hab6+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        DobleTI hab7 = new DobleTI("Incluye", "Incluye", "Incluye", "Incluye", "2 Camas Mtrimoniales", 3650f, "15:00 hrs", "00:00 hrs", 1000f);
        System.out.println("Doble Todo Incluido "+"\n"+hab7+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        SuiteTI hab8 = new SuiteTI("Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "1 Cama KingSize", 5950f, "15:00 hrs", "00:00 hrs", 1200f);
        System.out.println("Suite Todo Incluido "+"\n"+hab8+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        KingTI hab9 = new KingTI("Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "1 Cama KingSize", 7850f, "15:00 hrs", "00:00 hrs", 1400f);
        System.out.println("King Todo Incluido "+"\n"+hab9+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        PresidencialTI hab10 = new PresidencialTI("Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "Incluye", "2 Camas KingSize", 9950f, "15:00 hrs", "00:00 hrs", 1600f);
        System.out.println("Presidencial Todo Incluido "+"\n"+hab10+"Vista al mar con cargo extra de $350.00 "+"\n"+"Vista al campo de golf con cargo extra de $200.00 "+"\n");
        
        System.out.println("*Ninguna de las habitaciones incluye propinas, servicios de spa y servicios de trasnporte"+"\n");
        
        //Esta es la prueba de la solucion al problema
        //Aqui se muestra como el gerente vera el tipo de habitacion que se reservo, 
        //Cuanto se cobro por la reservacion unitaria y la cantidad de habitaciones de un mismo tipo de reservacion 
        
        System.out.println("Cantidad y tipos de reservaciones"+"\n");
        
        Registro reg1 = new Registro("Sencilla sin ningun servicio, con vista al mar", 4, 4350f, 18);
        System.out.println(reg1);
        
        Registro reg2 = new Registro("Presidencial con todo incluido, con vista al campo de golf", 10, 26150f, 3);
        System.out.println(reg2);
        
        Registro reg3 = new Registro("Suite con todo incluido, con vista al mar", 5, 12300f, 9);
        System.out.println(reg3);
        
    }
}
