package org.example.people;

public class Human {
    private String name;
    private String surname;
    private boolean child;

    public Human() {
        this.name = new String();
        this.surname = new String();
    }

    public Human(String name, String surname, boolean child) {
        this.name = name;
        this.surname = surname;
        this.child = child;
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

    public boolean getChild() {
        return child;
    }

    public void setChild(boolean child) {
        this.child = child;
    }

    public void salaryCalc(double salary, double longOfWork){

    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}
