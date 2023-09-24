package org.example.firm;

import org.example.people.Employee;
import org.example.table.Table;

import javax.swing.*;

public class Salary extends Firm{
    private double allSalary;

    public Salary(Firm firm) {
        super();
        this.employees = firm.employees;
        this.paymentT = firm.paymentT;
        this.table = firm.table;
        this.allSalary = 0;
    }

    @Override
    public void salaryEmployee (Employee employee){
        if (employee.getPaymentType() == super.paymentT.get(0)){
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Оплата труда за день", employee.getName() + " " + employee.getSurname() +  " Ставка",
                    JOptionPane.INFORMATION_MESSAGE));
            double langOfWork = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Количество отработанных дней", "Срок", JOptionPane.INFORMATION_MESSAGE));
            employee.salaryCalc(salary, langOfWork);
        }
        if (employee.getPaymentType() == super.paymentT.get(1)){
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Оплата труда за час", employee.getName() + " " + employee.getSurname() +  " Ставка",
                    JOptionPane.INFORMATION_MESSAGE));
            double langOfWork = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Количество отработанных часов", "Срок", JOptionPane.INFORMATION_MESSAGE));
            employee.salaryCalc(salary, langOfWork);
        }
        if (employee.getPaymentType() == super.paymentT.get(2)){
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Оплата труда за одну выполненую работу",
                    employee.getName() + " " + employee.getSurname() + " Ставка",
                    JOptionPane.INFORMATION_MESSAGE));
            double langOfWork = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Количество выполненных работ", "Срок", JOptionPane.INFORMATION_MESSAGE));
            employee.salaryCalc(salary, langOfWork);
        }
        this.allSalary += employee.getSalaryEmp();
    }

    public void resultTable(Firm firm) {
//        final int columnCnt = 10;
        Table table = firm.getTable();
//        String strTitle[] = new String[columnCnt];
//        strTitle[0] = "Отчёт по ЗП";
//        super.table.addData(strTitle);
        for (int i = 0; i < super.employees.size(); i++){
            String[] str = new String[super.columnCnt];
//            str[0] = super.employees.get(i).getName() + " " + super.employees.get(i).getSurname();
//            str[2] = super.employees.get(i).getPaymentType();
            str[3] = String.valueOf(super.employees.get(i).getSalaryEmp());
            table.addData(str);
        }
        String[] resultStr = new String[super.columnCnt];
        resultStr[0] = "Итог";
        resultStr[3] = String.valueOf(this.allSalary);
        table.addData(resultStr);
        firm.setTable(table);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Итого:\t\t\t\t\t\t\t" + allSalary;
    }
}
