
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HelloSelenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://v1.training-support.net");

        System.out.println("Title:"+driver.getTitle());

        driver.quit();
    }
}