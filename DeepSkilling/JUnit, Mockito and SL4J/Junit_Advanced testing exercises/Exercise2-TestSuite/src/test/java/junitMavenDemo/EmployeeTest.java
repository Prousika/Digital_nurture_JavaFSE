package junitMavenDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void testEmployee(){

        Employee emp=new Employee("Prousika",50000);

        assertEquals("Prousika",emp.getName());

        assertEquals(50000,emp.getSalary());

    }

}