package junitMavenDemo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({

        CalculatorTest.class,
        EmployeeTest.class,
        EvenCheckerTest.class,

})

public class AllTests {

}
