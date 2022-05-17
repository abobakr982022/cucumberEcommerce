package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P06ChooseCatagory {
    static WebDriver driver;
    public P06ChooseCatagory(WebDriver driver){
        this.driver=driver;
    };
    public WebElement firstpath2(){
        By firstpathh2 = By.cssSelector("a[href=\"/electronics\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement firstpath3(){
        By firstpathh3 = By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]");
        WebElement firstpath3 = driver.findElement(firstpathh3);
        return firstpath3;
    }
    public WebElement tolist(){
        By firstpathh3 = By.cssSelector("a[title=\"List\"]");
        WebElement firstpath3 = driver.findElement(firstpathh3);
        return firstpath3;
    }
    public void scroll(){
        WebElement Element3=driver.findElement(By.cssSelector("a[href=\"/apple-icam\"]"));
        JavascriptExecutor jsss =(JavascriptExecutor) driver;
        jsss.executeScript("arguments[0].scrollIntoView();", Element3);
    }


}
