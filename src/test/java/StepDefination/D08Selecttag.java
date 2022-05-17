package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P07Filtercolor;
import pages.P08Selecttag;

public class D08Selecttag {
    P08Selecttag selecttag =new P08Selecttag(Hooks.driver);

    @When("user navigate to login page and scroll")
    public void navtoapperal() throws InterruptedException {
        selecttag.navtoapperal();
        selecttag.scroll();
    }
    @Then("select tag")
    public void selecttag() throws InterruptedException {
        selecttag.selecttag().click();
    }

}
