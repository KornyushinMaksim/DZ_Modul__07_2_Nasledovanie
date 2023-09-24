//      Разработать и протестировать набор классов для решения задачи
//        подсчета зароботной платы сотрудников некоторой фирмы.
//        На фирме есть несколько способов оплаты труда:
//        ■ ставка – указывается, сколько сотрудник получает за рабочий день;
//        для каждого сотрудника записывается, сколько дней он отработал в месяце;
//        ■ почасовая – указывается, сколько сотрудник получает в час, для каждого сотрудника;
//        записывается, сколько часов он отработал в месяце
//        ■ сдельная – указывается, сколько сотрудник получит за выполненную работу;
//        для каждого сотрудника записываются суммы для каждой работы, что он успел сделать за месяц.

package org.example;

import org.example.firm.Child;
import org.example.firm.Salary;
import org.example.firm.Firm;
import org.example.firm.Tax;
import org.example.people.Employee;
import org.example.people.Human;
import org.example.table.Table;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Фирма \"X\"");
        jf.setSize(new Dimension(600, 600));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridBagLayout());




        Firm firm = new Firm();
        Salary salary = new Salary(firm);
        Tax tax = new Tax(firm);
        Child child = new Child(firm);

        Human human = new Human("Ваня", "Бутько", true);
        Human human1 = new Human("Петя", "Петров", false);
        Human human2 = new Human("Иван", "Иванов", false);

        Employee employee = firm.recruitment(human);
        Employee employee1 = firm.recruitment(human1);
        Employee employee2 = firm.recruitment(human2);

        salary.salaryEmployee(employee);
        salary.salaryEmployee(employee1);
        salary.salaryEmployee(employee2);

        tax.salaryTax(employee);
        tax.salaryTax(employee1);
        tax.salaryTax(employee2);

        child.childTax(employee);
        child.childTax(employee1);
        child.childTax(employee2);

        firm.resultTable();
        salary.resultTable(firm);
//        Table table =  firm.getTable();
//        JTable jTable = new JTable(table);
//        JScrollPane tableScroll = new JScrollPane(jTable);
//        tableScroll.setPreferredSize(new Dimension(1000, 400));
//
//        jf.add(tableScroll, new GridBagConstraints(0, 0, 1, 1, 1, 1,
//                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
//                new Insets(1, 1, 1, 1), 0, 0));

//        jf.setVisible(true);
//        jf.pack();


        System.out.println(firm);
        System.out.println("task1");
        System.out.println(salary);
        System.out.println("task2");
        System.out.println(tax);
        System.out.println("task3");
        System.out.println(child);


//        for (JobTitle jobTitle : JobTitle.values()){
//            System.out.println(jobTitle);
//        }
//
//        System.out.println();
//        JobTitle[] jobTitle = JobTitle.values();
//        System.out.println(jobTitle[3]);
    }
}
