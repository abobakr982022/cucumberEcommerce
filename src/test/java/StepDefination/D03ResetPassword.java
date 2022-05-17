package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.P02Login;
import pages.P03ResetPassword;

public class D03ResetPassword {
    P03ResetPassword resetPassword = new P03ResetPassword(Hooks.driver);
    String email="abobakrahmed982022@gmail.com";
    @Given("user navigate to login page to recover password")
    public void navlogin(){
        resetPassword.linkElement().click();
    }
    @When("user press on forget password")
    public void pressonforgetpassword(){
        resetPassword.passwordrecoverylinkElement().click();
    }
    @And("Enter email to recover password")
    public void EmailconfirmElement(){
        resetPassword.EmailconfirmElement().sendKeys(email);
    }
    @And("Press on Recover button")
    public void sendmail(){
        resetPassword.sendmailElement().click();
    }
    @Then("confirm that this message is displayed \"Email with instructions has been sent to you.\"")
    public void AssertionForRecovery() throws InterruptedException {
        //Assertion for text 'Email with instructions has been sent to you'.
        SoftAssert soft = new SoftAssert();
        String ExpectedResult="Email with instructions has been sent to you.";
    String ActualResult = resetPassword.AssertionForRecover().getText() ;
        soft.assertTrue(ActualResult.contains(ExpectedResult),"Assertion for text 'Email with instructions has been sent to you'");
        Thread.sleep(3000);
    }


}
