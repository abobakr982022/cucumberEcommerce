package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P08Selecttag {
    static WebDriver driver;
    public P08Selecttag(WebDriver driver)
    {
        this.driver=driver;
    };
    public void navtoapperal() throws InterruptedException {
       driver.navigate().to("https://demo.nopcommerce.com/apparel");
        Thread.sleep(3000);
    }
    public void scroll() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/apparel");
        WebElement Element=driver.findElement(By.cssSelector("a[href=\"/producttag/all\"]"));
        JavascriptExecutor jss =(JavascriptExecutor) driver;
        Thread.sleep(3000);
    }
    public WebElement selecttag(){
        By firstpathh2 = By.cssSelector("a[href=\"/game\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }




}
