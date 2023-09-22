package org.example.task1_firm.project;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Firm{
    Enum<JobTitle> jobTitleEnum;
    private ArrayList<String> paymentT;
    private ArrayList<Employee> employees;

    public Firm() {
        paymentT = new ArrayList<>();
        employees = new ArrayList<>();
        paymentT.add("ставка");
        paymentT.add("почасовая");
        paymentT.add("сдельная");
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
        return newEmployee;
    }

    public void salaryEmployee (Employee employee){
        if (employee.getPaymentType() == this.paymentT.get(0)){
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Оплата труда за день", employee.getName() + " " + employee.getSurname() +  " Ставка",
                    JOptionPane.INFORMATION_MESSAGE));
            double langOfWork = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Продолжительность отработанных дней", "Срок", JOptionPane.INFORMATION_MESSAGE));
            employee.salaryCalc(salary, langOfWork);
        }
        if (employee.getPaymentType() == this.paymentT.get(1)){
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Оплата труда за час", employee.getName() + " " + employee.getSurname() +  " Ставка",
                    JOptionPane.INFORMATION_MESSAGE));
            double langOfWork = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Продолжительность отработанных часов", "Срок", JOptionPane.INFORMATION_MESSAGE));
            employee.salaryCalc(salary, langOfWork);
        }
        if (employee.getPaymentType() == this.paymentT.get(2)){
            double salary = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Оплата труда за одну выполненую работу", employee.getName() + " " + employee.getSurname() + " Ставка",
                    JOptionPane.INFORMATION_MESSAGE));
            double langOfWork = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Количество выполненных работ", "Срок", JOptionPane.INFORMATION_MESSAGE));
            employee.salaryCalc(salary, langOfWork);
        }
    }

    @Override
    public String toString() {
        return "Сотрудники\n" + employees;
    }
}
