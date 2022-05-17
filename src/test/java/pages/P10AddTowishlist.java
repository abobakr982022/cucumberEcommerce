package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class P10AddTowishlist {
    static WebDriver driver;
    public P10AddTowishlist(WebDriver driver)
    {
        this.driver=driver;
    };
    public void navtogame() throws InterruptedException {
       driver.navigate().to("https://demo.nopcommerce.com/game");
        Thread.sleep(3000);
    }
    public WebElement selectbooks(){
        By firstpathh2 = By.cssSelector("a[href=\"/books\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement addtowishlist(){
        By firstpathh2 = By.cssSelector("div[data-productid=\"37\"] button[title=\"Add to wishlist\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement gotowishlist(){
        By firstpathh2 = By.cssSelector("a[href=\"/wishlist\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }

    public void scroll() throws InterruptedException {
        JavascriptExecutor jss =(JavascriptExecutor) driver;
        WebElement Element=driver.findElement(By.cssSelector("a[href=\"/fahrenheit-451-by-ray-bradbury\"]"));
        jss.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
    }

}
