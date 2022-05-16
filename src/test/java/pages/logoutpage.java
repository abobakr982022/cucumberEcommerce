package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutpage {
    WebDriver driver;
    public logoutpage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement logout(){
        By logoutt = By.cssSelector("a[href=\"/logout\"]");
        WebElement logout = driver.findElement(logoutt);
        return logout;
    }
}
