//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ProjectActivity_09 {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\002PV6744\\FST_Selenium\\chrome.exe");
    }

    @BeforeTest
    public void launchBrowser() {
        driver.navigate().to("https://alchemy.hguy.co/lms");
        driver.manage().window().maximize();
    }

    @Test
    public void validateHeader() {
        driver.findElement(By.xpath(".//*[contains(text(),'My Account')]")).click();
        driver.findElement(By.xpath(".//a[contains(text(),'Login')]")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        driver.findElement(By.xpath(".//*[contains(text(),'All Courses')]")).click();
        driver.findElement(By.xpath(".//div[contains(@class,'list-')]/div[2]/article[1]/a[1]/img[1]")).click();
        driver.findElement(By.xpath(".//*[contains(text(),'Deliverability Of Your Emails')]")).click();
        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle,"Deliverability Of Your Emails – Alchemy LMS");

    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
