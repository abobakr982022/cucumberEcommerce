package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.P02Login;
import pages.P12CreatesuccessfulOrder;

public class D12CreatesuccessfulOrder {
    P12CreatesuccessfulOrder createsuccessfulOrder  =new P12CreatesuccessfulOrder(Hooks.driver);

    @When("user login and add product to cart")
    public void loginandaddcart() throws InterruptedException {

       createsuccessfulOrder.linkLogin().click();
       createsuccessfulOrder.Email().sendKeys("abobakrahmed@gmail.com");
       createsuccessfulOrder.password().sendKeys("123456");
       createsuccessfulOrder.loginbutton().click();
       createsuccessfulOrder.navtogame();
       createsuccessfulOrder.selectgamee().click();
       createsuccessfulOrder.scrolll();
       createsuccessfulOrder.addtocart().click();

    }
    @Then("insert all data required")
    public void paymentprocess() throws InterruptedException {
        createsuccessfulOrder.navtocart();
        createsuccessfulOrder.termsofservicecheck().click();
        createsuccessfulOrder.checkout().click();
        createsuccessfulOrder.opendroptoselectcountry().click();
        createsuccessfulOrder.Entercountry().click();
        createsuccessfulOrder.Selectcountry().sendKeys("g");
        createsuccessfulOrder.Selectcountry().sendKeys(Keys.ENTER);
        createsuccessfulOrder.Entercity().sendKeys("Giza");
        createsuccessfulOrder.Enteradress1().sendKeys("El-Haram");
        createsuccessfulOrder.Enteradress2().sendKeys("El-Haram2");
        createsuccessfulOrder.EnterZIP().sendKeys("25656");
        createsuccessfulOrder.EnterPhoneNumber().sendKeys("0112525656");
        createsuccessfulOrder.EnterFaxNumber().sendKeys("0235647896");
        createsuccessfulOrder.save().click();
        createsuccessfulOrder.navtoshipping_method();
        Thread.sleep(1000);
        createsuccessfulOrder.shippingbuttonn().click();
        createsuccessfulOrder.CardholderName().sendKeys("bakr");
        createsuccessfulOrder.CardNumber().sendKeys("125125125125");
        createsuccessfulOrder.selExpireMonth().click();
        createsuccessfulOrder.selExpireMonthval().click();
        createsuccessfulOrder.CardCode().sendKeys("122");
        createsuccessfulOrder.paymentinfonextstepbutton().click();
        createsuccessfulOrder.confirm().click();
        Thread.sleep(1000);
        createsuccessfulOrder.confirmdone().click();



    }

}
