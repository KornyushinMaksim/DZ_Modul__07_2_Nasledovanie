package org.example.task1_firm.project;

import org.example.people.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void salaryCalc() {
        Employee employee = new Employee();
        employee.salaryCalc(200, 3);
        Assertions.assertEquals(600, employee.getSalaryEmp());
    }
}