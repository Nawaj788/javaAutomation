package Table;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductName {
    WebDriver wd = new ChromeDriver();

    @Before
    public void openChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
    }

    @Test
    public void listofProduct() {
        List<String> names = new ArrayList<>();
        List<String> expectedNames = Arrays.asList("Chais", "Chang", "Aniseed Syrup", "Chef Anton's Cajun Seasoning", "Chef Anton's Gumbo Mix");
        List<WebElement> actualName = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));
        for (WebElement b : actualName) {
            names.add(b.getText());
            System.out.println(b.getText());
        }
        Assert.assertEquals(names,expectedNames);
    }

    @After
    public void exit() {
        wd.quit();
    }
}



