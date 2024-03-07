package controller;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PersonController extends AbstractTableModel {

    private List<Person> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "CPF", "Telefone", "Email"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getName();
            case 1:
                return dados.get(rowIndex).getCpf();
            case 2:
                return dados.get(rowIndex).getCel();
            case 3:
                return dados.get(rowIndex).getEmail();

        }

        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
     switch (columnIndex) {
            case 0:
                dados.get(rowIndex).setName((String)aValue);
                break;
            case 1:
                dados.get(rowIndex).setCpf((String)aValue);
                break;
            case 2:
                dados.get(rowIndex).setCel(Integer.parseInt((String)aValue));
                break;
            case 3:
                dados.get(rowIndex).setEmail((String)aValue);
                break;

        }
     this.fireTableRowsUpdated(rowIndex, rowIndex);
    
    }


    public void addRow(Person c) {
        this.dados.add(c);
        this.fireTableDataChanged();
        

    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    

}
