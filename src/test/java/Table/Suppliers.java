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

public class Suppliers {
    WebDriver wd = new ChromeDriver();
    @Before
    public void first() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
    }

    @Test
    public void listofSupplies(){
        List<String> a = new ArrayList<>();
        List<String> expectedSupplies = Arrays.asList("1","1","1","2","2");
        List<WebElement> actualSupplies = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[3]"));
        for(WebElement b:actualSupplies)
        {
            a.add(b.getText());
            System.out.println(b.getText());
        }
        Assert.assertEquals(a,expectedSupplies);
    }
    @After
    public void exit(){
        wd.quit();
    }
}
