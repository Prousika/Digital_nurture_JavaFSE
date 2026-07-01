package junitAssertionsDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    Employee emp = new Employee("Prousika",21,50000);

    @Test
    void testName(){
        assertEquals("Prousika", emp.getName());
    }

    @Test
    void testSalary(){
        assertNotEquals(10000,emp.getSalary());
    }

    @Test
    void testVotingEligibility(){
        assertTrue(emp.isEligibleForVote());
    }

    @Test
    void testMinor(){
        assertFalse(15>=18);
    }

    @Test
    void testDepartment(){
        assertNull(emp.getDepartment());
    }

    @Test
    void testEmployeeObject(){
        assertNotNull(emp);
    }
}
