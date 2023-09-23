package org.example.task1_firm.project;

import java.text.DecimalFormat;

public class Employee extends Human{
    private String jobTitle;
    private String paymentType;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(Human human) {
        super(human.getName(), human.getSurname(), human.getAge());
        this.jobTitle = new String();
        this.paymentType = new String();
        this.salary = 0;
    }

    public Employee(String name, String surname, int age, String paymentType) {
        super(name, surname, age);
        this.paymentType = paymentType;
        this.salary = 0;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void salaryCalc(double salary, double longOfWork) {
        this.salary = salary * longOfWork;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f\n", super.toString(), this.paymentType, this.salary);
    }
}
