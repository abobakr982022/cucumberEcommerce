package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P09AddToShopCart;
import pages.P10AddTowishlist;

public class D10AddTowishlist {
    P10AddTowishlist addTowishlist =new P10AddTowishlist(Hooks.driver);

    @When("user navigate to page and select catagory")
    public void navtopageandselectcatagory() throws InterruptedException {
        addTowishlist.navtogame();
        addTowishlist.selectbooks().click();
    }
    @Then("addtowishlist and go to wishlist")
    public void addandnavtowishlist() throws InterruptedException {
        addTowishlist.addtowishlist().click();
        addTowishlist.gotowishlist().click();
    }

}
