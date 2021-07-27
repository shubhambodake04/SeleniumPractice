import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "start-maximized", "incognito");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Shubham\\IdeaProjects\\First_Automation\\Checkbox.html");

        List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
        System.out.println(checkbox.size());

        for(int index=0; index<=checkbox.size()-1; ++index)
        {
            checkbox.get(index).click();
            System.out.println("Select all the checkbox..");
            Thread.sleep(500);
        }
        for(int index=checkbox.size()-1; index>=0; index--)
        {
            checkbox.get(index).click();
            System.out.println("Deselect all the checkboxes in reverse order..");
            Thread.sleep(500);
        }
        //checkbox.get(0).click();
        driver.findElement(By.name("C")).click();
       // checkbox.get(checkbox.size()-1).click();
        driver.findElement(By.name("PHP")).click();
        System.out.println("Select first and last checkbox..");
        Thread.sleep(500);
        driver.quit();
    }
}
