package org.example.firm;

import org.example.people.Employee;
import org.example.people.Human;
import org.example.table.Table;

import java.util.ArrayList;

public class Firm{
    protected Table table;
    protected ArrayList<String> paymentT;
    protected ArrayList<Employee> employees;
    protected int columnCnt;


    public Firm() {
        this.table = new Table(10);
        paymentT = new ArrayList<>();
        employees = new ArrayList<>();
        paymentT.add("ставка   ");
        paymentT.add("почасовая");
        paymentT.add("сдельная ");
        this.columnCnt = 10;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Employee recruitment(Human human){
        Employee newEmployee = new Employee(human);
        int key = (int)(Math.random() * paymentT.size());
        switch (key){
            case 0:
                newEmployee.setPaymentType(this.paymentT.get(0));
                break;
            case 1:
                newEmployee.setPaymentType(this.paymentT.get(1));
                break;
            case 2:
                newEmployee.setPaymentType(this.paymentT.get(2));
                break;
        }
        employees.add(newEmployee);
        nds(newEmployee);
        return newEmployee;
    }

    public void nds(Employee employee){
        if (employee.getPaymentType() == "ставка   " || employee.getPaymentType() == "почасовая"){
            employee.setTaxEmp(20);
        } else if (employee.getPaymentType() == "сдельная "){
            employee.setTaxEmp(15);
        }
    }

    public void salaryEmployee (Employee employee){};
    public void salaryTax(Employee employee){};

        @Override
    public String toString() {
            String str = "ФИО\t\t\t\tВид оплаты\t\tВыплата\n";
            for (int i = 0; i < this.employees.size(); i++){
                str += this.employees.get(i);
            }
            return str;
       // return String.format("Сотрудники\n%s\n",this.employees);
    }

    public Table resultTable(){
        Table table = this.getTable();
        String strTitle[] = new String[this.columnCnt];
        strTitle[0] = "Полный отчёт";
        table.addData(strTitle);
        for (int i = 0; i < this.employees.size(); i++){
            String[] str = new String[this.columnCnt];
            str[0] = this.employees.get(i).getName() + " " + this.employees.get(i).getSurname();
            str[2] = this.employees.get(i).getPaymentType();
            table.addData(str);
        }
        this.setTable(table);
        return this.table;
    }


}
