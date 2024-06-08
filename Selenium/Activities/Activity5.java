import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.get("https://v1.training-support.net/selenium/input-events");
            // Print the title of the page
            System.out.println("Home page title: " + driver.getTitle());

            Actions builder = new Actions(driver);
            WebElement front = driver.findElement(By.xpath("//div[contains(@id,'side')]"));
            builder.moveToElement(front).build().perform();
            builder.click().build().perform();
            String  frontText=front.getText();
            System.out.println(frontText);

            // Perform left click
            builder.doubleClick().build().perform();
             frontText=front.getText();
            System.out.println(frontText);

            // Perform left click
            builder.contextClick().build().perform();
            // Print the front side text
            frontText=front.getText();
            System.out.println(frontText);

            // Close the browser
            driver.close();
        }
    }

