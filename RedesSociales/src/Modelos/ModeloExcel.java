/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;
/**
 *
 * @author dmathews
 */
public class ModeloExcel {
    Workbook book;
    
    public String Cargar(File archivo, JTable tabla) {
        String mensaje = "Error en la importacion";
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        
        try {
            book = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = book.getSheetAt(0);
            Iterator FilaIterator = hoja.rowIterator();
            int IndiceFila=-1;
            
            while(FilaIterator.hasNext()) {
                IndiceFila++;
                Row fila = (Row)FilaIterator.next();
                Iterator ColumnaIterator = fila.cellIterator();
                
                Object[]ListaColumna = new Object[9999];
                int IndiceColumna=-1;
                
                while(ColumnaIterator.hasNext()) {
                    IndiceColumna++;
                    Cell celda = (Cell)ColumnaIterator.next();
                    
                    if(IndiceFila==0) {
                        modelo.addColumn(celda.getStringCellValue());
                    }else{
                        if(celda!=null) {
                            switch (celda.getCellType()) {
                                case Cell.CELL_TYPE_NUMERIC:
                                    ListaColumna[IndiceColumna]=(int)Math.round(celda.getNumericCellValue());
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    ListaColumna[IndiceColumna]=celda.getStringCellValue();
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:
                                    ListaColumna[IndiceColumna]=celda.getBooleanCellValue();
                                    break;
                                default:
                                    ListaColumna[IndiceColumna]=celda.getDateCellValue();
                                    break;
                            }
                        }
                    }
                }
                
                if(IndiceFila!=0)modelo.addRow(ListaColumna);
            }
            mensaje = "Carga Exitosa";
            
        }catch(Exception e){ 
        }
        return mensaje;
    }
}
