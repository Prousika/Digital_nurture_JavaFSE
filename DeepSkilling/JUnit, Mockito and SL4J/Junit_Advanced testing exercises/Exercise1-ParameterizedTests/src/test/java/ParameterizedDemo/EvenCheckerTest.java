package ParameterizedDemo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {
     EvenChecker check = new EvenChecker();

     @ParameterizedTest
     @ValueSource(
             ints ={
                     2,4,6,8,10
             })
     void testEvenNumber(int number){
          assertTrue(check.isEven(number));
     }
}
