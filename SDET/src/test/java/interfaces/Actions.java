package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Actions {

    public void launchApp(String appName);
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Config.URL);
    }

    public void findElement(String locator);
    public void isElementVisible(WebElement element);
    {
        WebElement ele = driver.findElement(By.cssSelector("button[data-testid=\"header-profile-menu\"]"));
        String text = ele.getText();
        System.out.println("text fetched is:" +text);
    }
    public void clickOnElement(WebElement element);
    public void enterText(WebElement element);

}
