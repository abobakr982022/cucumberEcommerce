package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.registerationpage;

public class Registeration {
    String email="abobavkrdahdmked9d8cs2d0sd233c5dcsd2@gmail.com";
    String password = "123456";
    registerationpage registeration=new registerationpage(Hooks.driver);

    @Given("user navigate to registeration page")
    public void navToRegisteration(){
        registeration.linkRegisterationElement().click();
    }
    @When("user enter data of registeration")
    public void enterRegisterationData() throws InterruptedException {
        registeration.gender().click();
        Thread.sleep(1000);
        registeration.userElement().sendKeys("Bakr");
        Thread.sleep(1000);
        registeration.LastnameElement().sendKeys("Ahmed");
        registeration.dayElement().click();
        registeration.monthElement().click();
        registeration.yearElement().click();
        registeration.EmailElement().sendKeys(email);
        registeration.companyElement().sendKeys("Bakr-Group");
        for (int i=0; i<=3 ; i++){
            registeration.NewsletterElement().click();
            Thread.sleep(500);
        }
        registeration.PasswordElement().sendKeys(password);
        registeration.ConfirmPasswordElement().sendKeys(password);
        Thread.sleep(3000);

    }
    @And("user click on register button")
    public void clickRegisterButton(){
        registeration.registerbuttonElement().click();
    }
    @And("user register successfully")
    public void registerSuccessfully(){
        // Assertion
        SoftAssert soft = new SoftAssert();
        String ExpectedValue = "Your registration completed";
        String ActualValue=registeration.Assertionforcompleteregister().getText();
        System.out.println(ActualValue);
        soft.assertTrue(ExpectedValue.contains(ActualValue),"Assertion for completing registeration");

    }
    @Then("continue registeration")
    public void registercontinue(){
        registeration.registercontinuebuttonElement().click();
    }


}