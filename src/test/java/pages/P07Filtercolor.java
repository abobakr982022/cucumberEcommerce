package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07Filtercolor {
    static WebDriver driver;
    public P07Filtercolor(WebDriver driver){
        this.driver=driver;
    };
    public WebElement navtoapperal() throws InterruptedException {
        By navtoapperall = By.cssSelector("a[href=\"/apparel\"]");
        WebElement navtoapperal = driver.findElement(navtoapperall);
        Thread.sleep(3000);
        return navtoapperal;
    }
    public WebElement selectproduct() throws InterruptedException {
        By selectproductt = By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000010_shoes_450.jpeg\"]");
        WebElement selectproduct = driver.findElement(selectproductt);
        Thread.sleep(3000);
        return selectproduct;
    }
    public void scroll() throws InterruptedException {
        WebElement Element=driver.findElement(By.className("prices"));
        JavascriptExecutor jss =(JavascriptExecutor) driver;
        jss.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
    }
    public WebElement selectcolor() throws InterruptedException {
        By selectcolorr = By.id("attribute-option-15");
        WebElement selectcolor = driver.findElement(selectcolorr);
        Thread.sleep(3000);
        return selectcolor;
    }




}
