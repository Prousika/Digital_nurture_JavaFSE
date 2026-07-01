package DemoSetup;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp(){
        account = new BankAccount(1000);
        System.out.println("Account created");
    }

    @AfterEach
    void tearDown(){
        account=null;
        System.out.println("Account closed");
    }

    @Test
    void testDeposit(){

        //Arrange
        double amount = 500;

        //Act
        double balance = account.deposit(amount);

        //Assert
        assertEquals(1500, balance);

    }

    @Test
    void testWithdraw(){

        //Arrange
        double amount = 300;

        //Act
        double balance = account.withdraw(amount);

        //Assert
        assertEquals(700, balance);
    }

}
