package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02Login {
    static WebDriver driver;
    public P02Login(WebDriver driver){
        this.driver=driver;
    };
    public static WebElement linkLogin(){
        By linkLoginn = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
        WebElement linkLogin = driver.findElement(linkLoginn);
        return linkLogin;
    }
    public static WebElement Email(){
        By Emaill = By.name("Email");
        WebElement Email = driver.findElement(Emaill);
        return Email;
    }
    public static WebElement password(){
        By Passwordd = By.name("Password");
        WebElement Password = driver.findElement(Passwordd);
        return Password;
    }
    public static WebElement loginbutton(){
        By loginbuttonn = By.className("login-button");
        WebElement loginbutton = driver.findElement(loginbuttonn);
        return loginbutton;
    }
}
