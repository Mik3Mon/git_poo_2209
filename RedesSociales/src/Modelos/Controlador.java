/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.event.ActionEvent;
import java.awt.event.AWTEventListener;
import java.io.*;
import redessociales.PresenciaRedesSociales;
import Modelos.ModeloExcel;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dmathews
 */
public class Controlador implements ActionListener{
    
    ModeloExcel ModeloEx = new ModeloExcel();
    PresenciaRedesSociales PRS = new PresenciaRedesSociales();
    JFileChooser SelectArchive = new JFileChooser();
    File archivo;
    int contador=0;
    
    public Controlador(PresenciaRedesSociales PRS, ModeloExcel ModeloEX) {
        this.PRS=PRS;
        this.ModeloEx=ModeloEX;
        this.PRS.jButton1.addActionListener(this);
        PRS.setVisible(true);
        PRS.setLocationRelativeTo(null);
        
    }
    
    public void AgregarFiltro() {
        SelectArchive.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)","xls"));
        SelectArchive.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)","xlsx"));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        contador++;
        if (contador==1)AgregarFiltro();
        
        if(e.getSource()==PRS.jButton1) {
            if(SelectArchive.showDialog(null, "Seleccionar Archivo")==JFileChooser.APPROVE_OPTION) {
                archivo=SelectArchive.getSelectedFile();
                
                if(archivo.getName().endsWith("xlxs")) {
                    JOptionPane.showMessageDialog(null, "Seleccionar archivo valido");
                }else {
                    JOptionPane.showMessageDialog(null, ModeloEx.Cargar(archivo, PRS.jTable1));
                }
            }
        }
    }
    
}
