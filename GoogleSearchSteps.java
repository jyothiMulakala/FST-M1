package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps {
    WebDriver driver;
    WebDriverWait wait ;

    @Given("^User is on Google homePage$")
     public void userIsOnGooglePage(){
      driver = new FirefoxDriver();
      wait = new WebDriverWait(driver , Duration.ofSeconds(15));
//open the browser
      driver.get("https://google.com");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void userTypesInCheese(){
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }
    @Then("^Show how many search results were shown$")
    public void showHowManySearchResults(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String result = driver.findElement(By.id("result-stats")).getText();
        System.out.println("The No. of Results :" + result);
    }
    @And("^Close the browser$")
    public void closeBrowser(){
        driver.close();
    }
}