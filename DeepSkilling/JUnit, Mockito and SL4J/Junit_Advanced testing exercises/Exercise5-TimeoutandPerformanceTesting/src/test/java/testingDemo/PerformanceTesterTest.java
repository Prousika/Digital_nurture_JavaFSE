package testingDemo;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesterTest {
    PerformanceTester test = new PerformanceTester();

    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofSeconds(3),()->test.performTask());
    }

}
