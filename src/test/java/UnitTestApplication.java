import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestApplication {
    Account account;
    String id = "nana";
    int password = 1234;

    @BeforeEach
    void init() {
        account = new Account("nana",1234);
        account.getApp().add(500);
    }

    @Test
    void testAdd(){
        account.getApp().add(200);
        assertEquals(account.getApp().getTotal(),700);
    }

    @Test
    void testPay(){
        account.getApp().pay(30);
        assertEquals(account.getApp().getTotal(),470);
    }

}