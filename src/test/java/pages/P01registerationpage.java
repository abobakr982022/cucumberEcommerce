package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01registerationpage {
    WebDriver driver;
    public P01registerationpage(WebDriver driver){
        this.driver= driver;
    }
    public WebElement userElement(){
        By usernamee = By.name("FirstName");
        WebElement username = driver.findElement(usernamee);
        return username;
    }
    public WebElement LastnameElement(){
        By LastNamee = By.name("LastName");
        WebElement LastName = driver.findElement(LastNamee);
        return LastName;
    }
    public WebElement dayElement(){
        By dayy = By.cssSelector("select[name=\"DateOfBirthDay\"] option[value=\"8\"]");
        WebElement day = driver.findElement(dayy);
        return day;
    }
    public WebElement monthElement(){
        By monthh = By.cssSelector("select[name=\"DateOfBirthMonth\"] option[value=\"5\"]");
        WebElement month = driver.findElement(monthh);
        return month;
    }
    public WebElement yearElement(){
        By yearr = By.cssSelector("select[name=\"DateOfBirthYear\"] option[value=\"1998\"]");
        WebElement year = driver.findElement(yearr);
        return year;
    }
    public WebElement EmailElement(){
        By emaill = By.name("Email");
        WebElement email = driver.findElement(emaill);
        return email;
    }
    public WebElement companyElement(){
        By Companyy = By.name("Company");
        WebElement Company = driver.findElement(Companyy);
        return Company;
    }
    public WebElement NewsletterElement(){
        By Newsletterr = By.name("Newsletter");
        WebElement Newsletter = driver.findElement(Newsletterr);
        return Newsletter;
    }
    public WebElement PasswordElement(){
        By Passwordd = By.name("Password");
        WebElement Password = driver.findElement(Passwordd);
        return Password;
    }
    public WebElement ConfirmPasswordElement(){
        By ConfirmPasswordd = By.name("ConfirmPassword");
        WebElement ConfirmPassword = driver.findElement(ConfirmPasswordd);
        return ConfirmPassword;
    }
    public WebElement registercontinuebuttonElement(){
        By registercontinuebuttonn = By.className("register-continue-button");
        WebElement registercontinuebutton = driver.findElement(registercontinuebuttonn);
        return registercontinuebutton;
    }
    public WebElement registerbuttonElement(){
        By registerbuttonn = By.name("register-button");
        WebElement registerbutton = driver.findElement(registerbuttonn);
        return registerbutton;
    }
    public WebElement linkRegisterationElement(){
        By linkk = By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
        WebElement link = driver.findElement(linkk);
        return link;
    }
    public WebElement gender(){
        By genderr = By.cssSelector("input[value=\"M\"]");
        WebElement gender = driver.findElement(genderr);
        return gender;
    }
    public WebElement Assertionforcompleteregister(){
        By genderr = By.className("result");
        WebElement gender = driver.findElement(genderr);
        return gender;
    }
}
