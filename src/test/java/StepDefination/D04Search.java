package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.P04Search;

public class D04Search {
    P04Search search =new P04Search(Hooks.driver);
    @When("user enter the product in search bar or substring of product")
    public void entertheproduct() throws InterruptedException {
        search.search().sendKeys("Cam");
        Thread.sleep(1500);
    }
    @And("choose from result of search the product")
    public void choosefromresultofsearch () throws InterruptedException {
        search.selectsearch().click();
        search.scroll();
        Thread.sleep(1500);
    }
    @And("scroll to see the result")
    public void scroll () throws InterruptedException {
        search.scroll();
        Thread.sleep(1500);
    }
}
