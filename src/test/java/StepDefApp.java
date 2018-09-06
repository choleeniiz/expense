import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefApp {
    User user;
    Application app;
    boolean check;

    @Before
    public void init() {
        user = new User();
    }

    @Given("a user with id (\\d+) and password (\\d+) exists")
    public void a_user_with_id_and_password_exists(String id, int pw) {
         user.addAcccount(new Account(id,pw));
    }

    @When("I login to application with id (\\d+) and password (\\d+)")
    public void I_login_to_application_with_id_and_password_(String id, int pw){
        check = user.checkUser(id,pw);
    }

    @Then("I can log in")
    public void I_can_log_in(){
        assertTrue(check);

    }

}
