package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.P04Search;
import pages.P05Switchcurrencies;

public class D05Switchcurrencies {
    P05Switchcurrencies switchcurrencies = new P05Switchcurrencies(Hooks.driver);
    P04Search search =new P04Search(Hooks.driver);
    @Given("choose product from search")
    public void entertheproduct() throws InterruptedException {
        search.search().sendKeys("Cam");
        Thread.sleep(1500);
    }
    @And("choose from result of search")
    public void choosefromresultofsearch () throws InterruptedException {
        search.selectsearch().click();
        search.scroll();
        Thread.sleep(1500);
    }

    @When("user enter required currency")
    public void enterrequiredcurrency () throws InterruptedException {
        switchcurrencies.Customercurrancy().click();
        switchcurrencies.Customercurrancy().sendKeys(Keys.ARROW_DOWN);
        switchcurrencies.Customercurrancy().sendKeys(Keys.ENTER);

    }
    @And("scroll down to see the price")
    public void scroll () throws InterruptedException {
        Thread.sleep(1500);
        switchcurrencies.scroll();
        Thread.sleep(1500);
    }
}
