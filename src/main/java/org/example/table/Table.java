package org.example.table;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class Table extends AbstractTableModel {

    private int columnCount;
    private ArrayList<String[]> dataSalary;
    public Table() {
        this.columnCount = 3;
        dataSalary = new ArrayList<>();
        for (int i = 0; i < dataSalary.size(); i++){
            dataSalary.add(new String[this.columnCount]);
        }
    }
    public Table(int columnCount) {
        this.columnCount = columnCount;
        dataSalary = new ArrayList<>();
        for (int i = 0; i < dataSalary.size(); i++){
            dataSalary.add(new String[this.columnCount]);
        }
    }

    @Override
    public int getRowCount() {
        return this.dataSalary.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnCount;
    }

    @Override
    public String getColumnName(int indexColumn){
        switch (indexColumn){
            case 0:
                return "ФИО";
            case 1:
                return "Дети";
            case 2:
                return "Вид оплаты";
            case 3:
                return "Выплата";
            case 4:
                return "НДС%";
            case 5:
                return "Выплата с учётом НДС";
            case 6:
                return "Выплата руб/тугрик";
            case 7:
                return "Офшоры";
            case 8:
                return "Премия";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] string = this.dataSalary.get(rowIndex);
        String strings = string[columnIndex];
        return strings;
    }

    public void addData(String[] strings){
        String[] rowString = strings;
        this.dataSalary.add(rowString);
    }
}
