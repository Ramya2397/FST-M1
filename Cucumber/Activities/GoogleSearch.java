package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearch {

    WebDriver driver;
    WebDriverWait wait;


    @Given("User is on Google Home Page")
    public void userIsOnGoogleHomePage() throws Throwable{
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Open the browser
        driver.get("https://www.google.com");

    }

    @When("User types in Cheese and hits ENTER")
    public void userTypesInCheeseAndHitsENTER() throws Throwable{
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
        System.out.println("Searching cheese");

    }

    @Then("Show how many search results were shown")
    public void showHowManySearchResultsWereShown()throws Throwable {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='kb0PBd cvP2Ce ieodic'])[1]")));
        String resultStats = driver.findElement(By.xpath("(//div[@class='kb0PBd cvP2Ce ieodic'])[1]")).getText();
        System.out.println("Number of results found: " + resultStats);

    }

    @And("Close the browser")
    public void closeTheBrowser() throws Throwable{
        driver.close();
    }
}
