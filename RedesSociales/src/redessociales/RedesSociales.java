/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redessociales;

import Modelos.Controlador;
import Modelos.ModeloExcel;

/**
 *
 * @author dmathews
 */
public class RedesSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloExcel ModeloEx = new ModeloExcel();
        PresenciaRedesSociales PRS = new PresenciaRedesSociales();
        Controlador ControlEx = new Controlador(PRS, ModeloEx);
    }
    
}
