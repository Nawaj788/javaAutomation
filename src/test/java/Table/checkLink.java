package Table;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkLink {
   WebDriver wd = new ChromeDriver();
   @Before
   public void openChromeBrowser() throws InterruptedException{
       System.setProperty("webdriver.chrome.browser","chromedriver.exe");
       wd.get("https://www.toolsqa.com/automation-practice-form/");
       wd.manage().window().maximize();
   }
   @Test
    public void first(){
       wd.findElement(By.linkText("Link Test")).isDisplayed();
       wd.manage().timeouts().implicitlyWait(10);
       Assert.;
   }
}
