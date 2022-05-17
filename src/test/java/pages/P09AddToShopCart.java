package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class P09AddToShopCart {
    static WebDriver driver;
    public P09AddToShopCart(WebDriver driver)
    {
        this.driver=driver;
    };
    public void navtogame() throws InterruptedException {
       driver.navigate().to("https://demo.nopcommerce.com/game");
        Thread.sleep(3000);
    }
    public WebElement selectgame(){
        By firstpathh2 = By.cssSelector("a[href=\"/game\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public void scroll() throws InterruptedException {
        JavascriptExecutor jss =(JavascriptExecutor) driver;
        WebElement Element=driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]"));
        jss.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
    }
    public WebElement addtocart(){
        By firstpathh2 = By.className("button-2");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public void Assertion(){
        //Assertion for text 'The product has been added to your shopping cart'.
        SoftAssert soft = new SoftAssert();
        String ExpectedResult="The product has been added to your shopping cart";
        String ActualResult = driver.findElement(By.className("content")).getText() ;
        soft.assertTrue(ActualResult.contains(ExpectedResult),"The product has been added to your shopping cart");
    }
}
