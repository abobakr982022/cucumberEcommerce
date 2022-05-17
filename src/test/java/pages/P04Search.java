package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P04Search {
    static WebDriver driver;
    public P04Search(WebDriver driver){
        this.driver=driver;
    };
    public WebElement linkElement(){
        By linkk = By.cssSelector("a[href=\"/\"]");
        WebElement link = driver.findElement(linkk);
        return link;
    }
    public WebElement search(){
        By searchh = By.className("search-box-text");
        WebElement search = driver.findElement(searchh);
        return search;
    }
    public WebElement selectsearch(){
        By selectsearchh = By.id("ui-id-2");
        WebElement selectsearch = driver.findElement(selectsearchh);
        return selectsearch;
    }
    public void scroll(){
        WebElement Element= driver.findElement(By.className("product-name"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

}
