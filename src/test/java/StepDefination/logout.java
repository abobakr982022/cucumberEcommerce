package StepDefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.logoutpage;

public class logout {
    logoutpage logoutpagee =new logoutpage(Hooks.driver);
    @When("user logout")
    public void logout(){
        logoutpagee.logout().click();
    }
}
