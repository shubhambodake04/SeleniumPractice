import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"))).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}