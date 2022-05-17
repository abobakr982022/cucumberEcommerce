package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03ResetPassword {
    static WebDriver driver;
    public P03ResetPassword(WebDriver driver){
        this.driver=driver;
    };
    public WebElement linkElement(){
        By linkk = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
        WebElement link = driver.findElement(linkk);
        return link;
    }
    public WebElement EmailElement(){
        By emaill = By.name("Email");
        WebElement email = driver.findElement(emaill);
        return email;
    }
    public WebElement passwordrecoverylinkElement(){
        By passwordrecoverylinkk = By.cssSelector("a[href=\"/passwordrecovery\"]");
        WebElement passwordrecoverylink = driver.findElement(passwordrecoverylinkk);
        return passwordrecoverylink;
    }
    public WebElement EmailconfirmElement(){
        By emaill = By.name("Email");
        WebElement email = driver.findElement(emaill);
        return email;
    }
    public WebElement sendmailElement(){
        By sendemaill = By.name("send-email");
        WebElement sendemail = driver.findElement(sendemaill);
        return sendemail;
    }
    public WebElement AssertionForRecover(){
        By Assertionn = By.className("content");
        WebElement Assertion = driver.findElement(Assertionn);
        return Assertion;
    }
}
