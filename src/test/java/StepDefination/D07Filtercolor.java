package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P07Filtercolor;

public class D07Filtercolor {
    P07Filtercolor filtercolor =new P07Filtercolor(Hooks.driver);

    @When("user select catagory")
    public void navtoapperal() throws InterruptedException {
        filtercolor.navtoapperal().click();
    }
    @And("user choose subcatagory")
    public void choosesubcatagory() throws InterruptedException {
        filtercolor.selectproduct().click();
    }
    @Then("Filter by color")
    public void filtercolor() throws InterruptedException {
        filtercolor.selectcolor().click();
    }

}
