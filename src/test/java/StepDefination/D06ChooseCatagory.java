package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.P06ChooseCatagory;

public class D06ChooseCatagory {
    P06ChooseCatagory chooseCatagory = new P06ChooseCatagory(Hooks.driver);
    @When("user Choose one catagory")
    public void choosefromcatagory() throws InterruptedException {
        chooseCatagory.firstpath2().click();
        Thread.sleep(1000);
    }
    @And("user choose from catagory subcatagory")
    public void choosefromsubcatagory() throws InterruptedException {
        chooseCatagory.firstpath3().click();
        Thread.sleep(1000);
    }
    @And("change the grid into list mode")
    public void list() throws InterruptedException {
        chooseCatagory.tolist().click();
        Thread.sleep(3000);
        chooseCatagory.scroll();
        Thread.sleep(2000);
    }



}
