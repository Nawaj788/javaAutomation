package OpenBrowser;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBrowser {
   // @Test
    public void openChromeBrowser()throws InterruptedException{
        //set Chrome Browser Driver
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        //Create ChromeDriver instance
        WebDriver wd = new ChromeDriver();

        //Open Browser
        wd.get("http://www.gmail.com");

        //maximize window
        wd.manage().window().maximize();

        //send nawaj123 in gmail form
        wd.findElement(By.id("identifierId")).sendKeys("qatesting00567@gmail.com");
        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
        Thread.sleep(3000);


        wd.findElement(By.name("password")).sendKeys("Test@123");
        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

        //wait for 5 sec
        Thread.sleep(5000);

        //Close Browser
        wd.quit();
    }








   // @Test
    public void openFirefoxBrowser()throws InterruptedException{
        //set gecko Browser Driver
        //gecko is just a driver for firefox browser
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");

        //Create FireFoxDriver instance
        WebDriver wd = new FirefoxDriver();

        //Open Browser
        wd.get("http://www.gmail.com");

        //Maximize Browser
        wd.manage().window().maximize();

        //wait for 10 sec
        Thread.sleep(10000);

        //Close Browser
        wd.quit();
    }//
    @Test
    public void invalidPassword()throws InterruptedException{
        //set Chrome Browser Driver
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        //Create ChromeDriver instance
        WebDriver wd = new ChromeDriver();

        //Open Browser
        wd.get("http://www.gmail.com");

        //maximize window
        wd.manage().window().maximize();

        //send nawaj123 in gmail form
        wd.findElement(By.id("identifierId")).sendKeys("qatesting00567@gmail.com");
        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
        Thread.sleep(3000);


        wd.findElement(By.name("password")).sendKeys("Tesad");
        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

        //wait for 5 sec
        Thread.sleep(5000);
        WebElement text = wd.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        String expectedString = "Wrong password. Try again or click Forgot password to reset it.";
        Assert.assertEquals(expectedString,text.getText());
        wd.quit();

    }
    }


