import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ChildPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent window - " +parentHandle);

        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> Handles = driver.getWindowHandles();
        System.out.println(Handles);
        for (String handle: Handles) {
            System.out.println(handle);
            if(!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                driver.findElement(By.name("fName")).sendKeys("Shubham");
                Thread.sleep(5000);
                driver.close();
            }
        }
        int count = Handles.size();
        System.out.println("Number of browser windows opened on the system is : "+ count);

        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("name")).sendKeys("hello");
        Thread.sleep(2000);
        driver.quit();
    }
}