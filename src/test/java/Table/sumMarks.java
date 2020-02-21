package Table;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sumMarks {
    WebDriver wd = new ChromeDriver();

    public void openChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");



        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
    }
@Test
        public void actualTest()

    {


        double sum = 0;
        double expectedSum = 95;

        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));

        for (WebElement row : rows) {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;
        }

        Assert.assertEquals(sum, expectedSum, 2); //delta is the 2 decimal place value
    }

            public void close() {



        wd.quit();
    }


}
