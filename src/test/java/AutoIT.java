import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AutoIT {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.monsterindia.com/seeker/registration");
        driver.findElement(By.xpath("//span[contains(text(),'Choose CV')]")).click();
        Thread.sleep(2000);

        Runtime.getRuntime().exec("C:\\Users\\Shubham\\Desktop\\AutoIT\\Resumeupload.exe");
        System.out.println("File Uploaded");
        Thread.sleep(5000);
        driver.quit();
}}
