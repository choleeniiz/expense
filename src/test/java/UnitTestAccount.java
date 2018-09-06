import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestAccount {
    Account account;
    String id = "nana";
    int password = 1234;

    @BeforeEach
    void init() {
        account = new Account("nana",1234);
    }

    @Test
    void testMatchPassword(){
        assertTrue(account.checkPassword(1234));
    }

    @Test
    void testMissMatchPassword(){
        assertFalse(account.checkPassword(123));
    }

}