package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Properties;

@Test()
public class Demo {

    Properties property;
    WebDriver driver;
    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("chrome driver is set up");
    }

    @Test
    public void test1(){
        driver.get(property.getProperty("url"));
        System.out.println("navigated to the url");

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
        System.out.println("chrome driver has been quit");
    }
}
