package junitMavenDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc=new Calculator();

    @Test
    @DisplayName("Addition Test")
    void testAddition(){

        assertEquals(30,calc.add(10,20));

    }

    @Test
    @DisplayName("Subtraction Test")
    void testSubtract(){

        assertEquals(10,calc.sub(20,10));

    }

}