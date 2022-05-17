package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.P02Login;

public class D02Login {
    P02Login login = new P02Login(Hooks.driver);
    String email="abobakrahmed@gmail.com";
    String password = "123456";

    @Given("user navigate to login page")
    public void navtologin(){
        P02Login.linkLogin().click();
    }
    @When("user enter valid data")
    public void enterValiddata(){
        P02Login.Email().sendKeys(email);
        P02Login.password().sendKeys(password);
    }
    @Then("login done")
    public void loginDone() throws InterruptedException {
        P02Login.loginbutton().click();
        Thread.sleep(2000);
    }


}
