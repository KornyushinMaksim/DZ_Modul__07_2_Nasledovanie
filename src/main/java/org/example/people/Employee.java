package org.example.people;

public class Employee extends Human{
    private String jobTitle;
    private String paymentType;
    private double salaryEmp;
    private double taxEmp;
    private double salaryForTax;
    private double addTax;
    private double salaryChildTax;

    public Employee() {
        super();
    }

    public Employee(Human human) {
        super(human.getName(), human.getSurname(), human.getChild());
        this.jobTitle = new String();
        this.paymentType = new String();
        this.salaryEmp = 0;
        this.taxEmp = 0;
    }

    public Employee(String name, String surname, boolean child, String paymentType) {
        super(name, surname, child);
        this.paymentType = paymentType;
        this.salaryEmp = 0;
        this.taxEmp = 0;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setSalaryEmp(double salaryEmp) {
        this.salaryEmp = salaryEmp;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getSalaryEmp() {
        return salaryEmp;
    }

    public double getTaxEmp() {
        return taxEmp;
    }

    public void setTaxEmp(double taxEmp) {
        this.taxEmp = taxEmp;
    }

    public double getSalaryForTax() {
        return salaryForTax;
    }

    public void setSalaryForTax(double salaryForTax) {
        this.salaryForTax = salaryForTax;
    }

    public double getAddTax() {
        return addTax;
    }

    public void setAddTax(double addTax) {
        this.addTax = addTax;
    }

    public double getSalaryChildTax() {
        return salaryChildTax;
    }

    public void setSalaryChildTax(double salaryChildTax) {
        this.salaryChildTax = salaryChildTax;
    }

    @Override
    public void salaryCalc(double salary, double longOfWork) {
        this.salaryEmp = salary * longOfWork;
    }

    @Override
    public String toString() {
        //String str = "ФИО\t\t\tВид оплаты\tВыплата\n";

        return String.format("%s\t\t%s\t\t%.2f\n", super.toString(), this.paymentType, this.salaryEmp);
    }
}
