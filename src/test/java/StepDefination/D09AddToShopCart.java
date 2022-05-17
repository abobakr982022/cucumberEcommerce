package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P08Selecttag;
import pages.P09AddToShopCart;

public class D09AddToShopCart {
    P09AddToShopCart addToShopCart =new P09AddToShopCart(Hooks.driver);

    @When("user navigate to page and select tag and scroll")
    public void navtopageandselecttag() throws InterruptedException {
        addToShopCart.navtogame();
        addToShopCart.selectgame();
        addToShopCart.scroll();
    }
    @Then("addtocart")
    public void selecttag() throws InterruptedException {
        addToShopCart.addtocart().click();
    }

}
