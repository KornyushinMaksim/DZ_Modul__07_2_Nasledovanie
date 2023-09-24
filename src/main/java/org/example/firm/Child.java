package org.example.firm;

import org.example.people.Employee;

public class Child extends Firm {
    private double addTax;
    private double salaryChildTax;
    public Child(Firm firm) {
        super();
        this.table = firm.table;
        this.employees = firm.employees;
        this.paymentT = firm.paymentT;
        this.columnCnt = firm.columnCnt;
        this.addTax = 0;
        this.salaryChildTax = 0;
    }

    public Child() {
        super();
        this.addTax = 0;
        this.salaryChildTax = 0;
    }

    public void childTax(Employee employee){
            if (!employee.getChild()){
                this.addTax = employee.getTaxEmp() + 5;
                employee.setSalaryChildTax(employee.getSalaryEmp() - ((employee.getSalaryEmp() / 100) * (addTax)));
                employee.setAddTax(this.addTax);
            } else {
                employee.setSalaryChildTax(employee.getSalaryForTax());
                employee.setAddTax(employee.getTaxEmp());
            }
    }

    @Override
    public String toString() {
        String str = "ФИО\t\t\t\tДети\tНДС%\tВыплата\n";
        for (int i = 0; i < super.employees.size(); i++) {
            str += super.employees.get(i).getName() + " " + super.employees.get(i).getSurname() +
                    "\t\t" + super.employees.get(i).getChild() + "\t" +
                    super.employees.get(i).getAddTax() + "\t" +
                    super.employees.get(i).getSalaryChildTax() + "\n";
        }
        return str;
    }
}
