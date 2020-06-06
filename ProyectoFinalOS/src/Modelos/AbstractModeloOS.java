/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dmathews
 */
public class AbstractModeloOS extends AbstractTableModel{
    private ArrayList<OperativeSystem> data;

    public AbstractModeloOS() {
    }

    public AbstractModeloOS(ArrayList<OperativeSystem> data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Nombre";
                break;
            case 1:
                columnName = "Arquitectura";
                break;
            case 2:
                columnName = "Version de Kernel";
                break;
            case 3:
                columnName = "Licencia";
                break;
            case 4:
                columnName = "Multiusuario";
                break;
            case 5:
                columnName = "Multitareas";
                break;
            default:
                columnName = "ND";
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OperativeSystem tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getNombre();
            case 1:
                return tmp.getArquitectura();
            case 2:
                return tmp.getVersionKernel();
            case 3:
                return tmp.getLicencia();
            case 4:
                return tmp.getMultiusuario();
            case 5:
                return tmp.getMultitareas();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        OperativeSystem tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setNombre((String)aValue);
                break;
            case 1:
                tmp.setArquitectura((String)aValue);
                break;
            case 2:
                tmp.setVersionKernel((String)aValue);
                break;
            case 3:
                tmp.setLicencia((String)aValue);
                break;
            case 4:
                tmp.setMultiusuario((String)aValue);
                break;
            case 5:
                tmp.setMultitareas((String)aValue);
                break;
            default:
                throw new AssertionError();
        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public void agregarOS(OperativeSystem c) {
        data.add(c);
        this.fireTableDataChanged();
    }
}
