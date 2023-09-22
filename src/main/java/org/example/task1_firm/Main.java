package org.example.task1_firm;

import org.example.task1_firm.project.Employee;
import org.example.task1_firm.project.Firm;
import org.example.task1_firm.project.Human;
import org.example.task1_firm.project.JobTitle;

public class Main {
    public static void main(String[] args) {

        Firm firm = new Firm();

        Human human = new Human("Ваня", "Бутько", 58);
        Human human1 = new Human("Петя", "Петров", 34);
        Human human2 = new Human("Иван", "Иванов", 36);

        Employee employee = firm.recruitment(human);
        Employee employee1 = firm.recruitment(human1);
        Employee employee2 = firm.recruitment(human2);

        firm.salaryEmployee(employee);
        firm.salaryEmployee(employee1);
        firm.salaryEmployee(employee2);

        System.out.println(firm);



//        for (JobTitle jobTitle : JobTitle.values()){
//            System.out.println(jobTitle);
//        }
//
//        System.out.println();
//        JobTitle[] jobTitle = JobTitle.values();
//        System.out.println(jobTitle[3]);
    }
}
