import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyBoardOperations
{

    public void setup() throws AWTException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications","start-maximized","incognito");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");


        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_TAB);
        driver.close();
    }

}
