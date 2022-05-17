package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P10AddTowishlist;
import pages.P11AddToComparelist;

public class D11AddTocomparelist {
    P11AddToComparelist addToComparelist =new P11AddToComparelist(Hooks.driver);

    @When("user navigate to page and select catagory to put it in comparelist")
    public void navtopageandselectcatagory() throws InterruptedException {
        addToComparelist.navtowishlist();
        addToComparelist.selectcatagory().click();
    }
    @Then("addtocomparelist and go to comparelist")
    public void addandnavtocomparelist() throws InterruptedException {
        addToComparelist.addtoComparelist().click();
       addToComparelist.gotoComparelist().click();
    }

}
