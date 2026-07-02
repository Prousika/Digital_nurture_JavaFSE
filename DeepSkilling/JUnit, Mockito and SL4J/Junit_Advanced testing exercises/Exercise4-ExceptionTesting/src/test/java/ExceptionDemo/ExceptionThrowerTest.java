package ExceptionDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {
    ExceptionThrower exception = new ExceptionThrower();

    @Test
    void testException(){
        assertThrows(ArithmeticException.class, ()->exception.throwException(10,0));
    }

}
