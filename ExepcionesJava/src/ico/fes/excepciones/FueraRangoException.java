/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.excepciones;

/**
 *
 * @author dmathews
 */
public class FueraRangoException extends Exception{
    
    @Override
    public String getMessage() {
        return "Operador fera de rango: 1-> suma, 2-> resta, 3-> multi, 4-> division";
    }
}
