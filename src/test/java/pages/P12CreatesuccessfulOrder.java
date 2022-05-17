package pages;

import org.openqa.selenium.*;
import org.testng.asserts.SoftAssert;

public class P12CreatesuccessfulOrder {
    static WebDriver driver;
    public P12CreatesuccessfulOrder(WebDriver driver)
    {
        this.driver=driver;
    };

    //login
    public  WebElement linkLogin(){
        By linkLoginn = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
        WebElement linkLogin = driver.findElement(linkLoginn);
        return linkLogin;
    }
    public WebElement Email(){
        By Emaill = By.name("Email");
        WebElement Email = driver.findElement(Emaill);
        return Email;
    }
    public  WebElement password(){
        By Passwordd = By.name("Password");
        WebElement Password = driver.findElement(Passwordd);
        return Password;
    }
    public  WebElement loginbutton(){
        By loginbuttonn = By.className("login-button");
        WebElement loginbutton = driver.findElement(loginbuttonn);
        return loginbutton;
    }
//addtocart
    public void navtogame() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/game");
        Thread.sleep(3000);
    }
    public WebElement selectgamee(){
        By firstpathh2 = By.cssSelector("a[href=\"/game\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public void scrolll() throws InterruptedException {
        JavascriptExecutor jss =(JavascriptExecutor) driver;
        WebElement Element=driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]"));
        jss.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
    }
    public WebElement addtocart(){
        By firstpathh2 = By.className("button-2");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }

    //make order
    public void navtocart() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/cart");
        Thread.sleep(3000);
    }
    public WebElement termsofservicecheck(){
        By firstpathh2 = By.name("termsofservice");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement checkout(){
        By firstpathh2 = By.name("checkout");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement opendroptoselectcountry(){
        By firstpathh2 = By.cssSelector("select[data-trigger=\"country-select\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement Entercountry(){
        By firstpathh2 = By.cssSelector("select[data-trigger=\"country-select\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement Selectcountry(){
        By firstpathh2 = By.cssSelector("select[data-trigger=\"country-select\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement Entercity(){
        By firstpathh2 = By.name("BillingNewAddress.City");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement Enteradress1(){
        By firstpathh2 = By.name("BillingNewAddress.Address1");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement Enteradress2(){
        By firstpathh2 = By.name("BillingNewAddress.Address2");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement EnterZIP(){
        By firstpathh2 = By.name("BillingNewAddress.ZipPostalCode");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement EnterPhoneNumber(){
        By firstpathh2 = By.name("BillingNewAddress.PhoneNumber");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement EnterFaxNumber(){
        By firstpathh2 = By.name("BillingNewAddress.FaxNumber");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement save(){
        By firstpathh2 = By.name("save");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public void navtoshipping_method() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/onepagecheckout#opc-shipping_method");
        Thread.sleep(3000);
    }
    public WebElement shippingbuttonn() throws InterruptedException {
        By firstpathh2 = By.cssSelector("div[id=\"shipping-method-buttons-container\"] button[type=\"button\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        Thread.sleep(2000);
        return firstpath2;
    }
    public WebElement CardholderName(){
        By firstpathh2 = By.id("CardholderName");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement CardNumber(){
        By firstpathh2 = By.name("CardNumber");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        return firstpath2;
    }
    public WebElement selExpireMonth() throws InterruptedException {
        By firstpathh2 = By.name("CardNumber");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        Thread.sleep(1000);
        return firstpath2;
    }
    public WebElement selExpireMonthval() throws InterruptedException {
        By firstpathh2 = By.cssSelector("select[data-val-required=\"Expire month is required\"] option[value=\"5\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        Thread.sleep(1000);
        return firstpath2;
    }
    public WebElement CardCode() throws InterruptedException {
        By firstpathh2 = By.name("CardCode");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        Thread.sleep(1000);
        return firstpath2;
    }
    public WebElement paymentinfonextstepbutton() throws InterruptedException {
        By firstpathh2 = By.className("payment-info-next-step-button");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        Thread.sleep(1000);
        return firstpath2;
    }
    public WebElement confirm() throws InterruptedException {
        By firstpathh2 = By.cssSelector("div[id=\"confirm-order-buttons-container\"] button[type=\"button\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        Thread.sleep(1000);
        return firstpath2;
    }
    public void assertion() throws InterruptedException {
        SoftAssert soft =new SoftAssert();
        String Expectedvalue="Your order has been successfully processed!";
        String ActualValue = driver.findElement(By.tagName("strong")).getText();
        soft.assertTrue(ActualValue.contains(Expectedvalue),"Your order has been successfully processed!");
    }
    public WebElement confirmdone() throws InterruptedException {
        By firstpathh2 = By.cssSelector("div[class=\"buttons\"] button[type=\"button\"]");
        WebElement firstpath2 = driver.findElement(firstpathh2);
        Thread.sleep(1000);
        return firstpath2;
    }









}
