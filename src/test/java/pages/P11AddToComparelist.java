package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class P11AddToComparelist {
    static WebDriver driver;
    public P11AddToComparelist(WebDriver driver)
    {
        this.driver=driver;
    };
    public void navtowishlist() throws InterruptedException {
       driver.navigate().to("https://demo.nopcommerce.com/wishlist");
        Thread.sleep(3000);
    }
    public WebElement selectcatagory(){
        By firstpathh2 = By.cssSelector("a[href=\"/jewelry\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement addtoComparelist(){
        By firstpathh2 = By.cssSelector("div[data-productid=\"40\"] button[title=\"Add to compare list\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement gotoComparelist(){
        By firstpathh2 = By.cssSelector("a[href=\"/compareproducts\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }

    public void scroll() throws InterruptedException {
        JavascriptExecutor jss =(JavascriptExecutor) driver;
        WebElement Element=driver.findElement(By.cssSelector("a[href=\"/elegant-gemstone-necklace-rental\"]"));
        jss.executeScript("arguments[0].scrollIntoView();", Element);
    }

}
