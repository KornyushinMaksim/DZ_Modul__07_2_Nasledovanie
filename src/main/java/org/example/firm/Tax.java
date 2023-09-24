package org.example.firm;

import org.example.people.Employee;
import org.example.table.Table;

public class Tax extends Firm {
    private double salaryForTax;
    private double allSalaryForTax;

    public Tax(Firm firm) {
        super();
        this.employees = firm.employees;
        this.paymentT = firm.paymentT;
        this.table = firm.table;
        this.salaryForTax = 0;
        this.allSalaryForTax = 0;
    }

    public double getSalaryForTax() {
        return salaryForTax;
    }

    @Override
    public void salaryTax(Employee employee) {
        employee.setSalaryForTax(employee.getSalaryEmp() - ((employee.getSalaryEmp() / 100) * employee.getTaxEmp()));
        this.allSalaryForTax += employee.getSalaryForTax();
    }

    @Override
    public Table resultTable() {
        //        final int columnCnt = 10;
        super.table = new Table(super.columnCnt);
//        String strTitle[] = new String[columnCnt];
//        strTitle[0] = "Отчёт по ЗП";
//        super.table.addData(strTitle);
        for (int i = 0; i < super.employees.size(); i++) {
            String[] str = new String[super.columnCnt];
            str[0] = super.employees.get(i).getName() + " " + super.employees.get(i).getSurname();
            str[2] = super.employees.get(i).getPaymentType();
            str[3] = String.valueOf(super.employees.get(i).getSalaryEmp());
            str[4] = String.valueOf(super.employees.get(i).getTaxEmp());
            str[5] = String.valueOf(super.employees.get(i).getSalaryForTax());
            super.table.addData(str);
        }
        String[] resultStr = new String[super.columnCnt];
        resultStr[0] = "Итог";
//        resultStr[3] = String.valueOf(this.allSalary);
        resultStr[5] = String.valueOf(this.allSalaryForTax);
        super.table.addData(resultStr);
        return super.table;
    }

    @Override
    public String toString() {
        String str = "ФИО\t\t\t\tНДС%\tВыплата\n";
        for (int i = 0; i < super.employees.size(); i++) {
            str += super.employees.get(i).getName() + " " + super.employees.get(i).getSurname() +
                    "\t\t" + super.employees.get(i).getTaxEmp() + "\t" + super.employees.get(i).getSalaryForTax() + "\n";
        }
        return str;
    }
}
