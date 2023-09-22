package org.example.task1_firm.project;

public class Human {
    private String name;
    private String surname;
    private int age;

    public Human() {
        this.name = new String();
        this.surname = new String();
        this.age = 0;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void salaryCalc(double salary, double longOfWork){

    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, surname, age);
    }
}
