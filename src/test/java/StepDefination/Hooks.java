package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
      static WebDriver driver=null;
    @Before
    public static void open_browser() throws InterruptedException {
        String chromeDriverPath= System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromeDriverPath);
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);


    }
    @After
    public static void close_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
