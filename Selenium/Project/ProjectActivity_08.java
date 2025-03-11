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

public class ProjectActivity_08 {
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
        driver.findElement(By.xpath(".//*[contains(text(),'Contact')]")).click();
        driver.findElement(By.xpath(".//div[contains(@class,'name')]/input[1]")).sendKeys("Test");
        driver.findElement(By.xpath(".//div[contains(@class,'email')]/input[1]")).sendKeys("Test2@email.co");
        driver.findElement(By.xpath(".//div[contains(@class,'textarea')]/textarea[1]")).sendKeys("This is test");
        driver.findElement(By.xpath(".//*[contains(text(),'Send Message')]")).click();
        String message = driver.findElement(By.xpath(".//div[contains(@class,'clear')]/section[4]/div[2]/div[2]/div[2]")).getText();
        Assert.assertEquals(message,"Thanks for contacting us! We will be in touch with you shortly.");

    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
