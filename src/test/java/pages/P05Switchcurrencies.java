package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05Switchcurrencies {
    static WebDriver driver;
    public P05Switchcurrencies(WebDriver driver){
        this.driver=driver;
    };
    public WebElement Customercurrancy(){
        By Customercurrancyy = By.name("customerCurrency");
        WebElement Customercurrancy = driver.findElement(Customercurrancyy);
        return Customercurrancy;
    }
    public WebElement Customerproduct(){
        By Customercurrancyy = By.id("main-product-img-16");
        WebElement Customercurrancy = driver.findElement(Customercurrancyy);
        return Customercurrancy;
    }
    public void scroll(){
        WebElement Element= driver.findElement(By.id("main-product-img-16"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
