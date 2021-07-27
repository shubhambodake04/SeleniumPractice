import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTest  {
    WebDriver driver;
   @BeforeTest
 public void setup(){
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--disable-notifications","start-maximized","incognito");
       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       driver = new ChromeDriver(options);
       //System.out.println("Website opened");
   }

   @Test
    public void test1() throws InterruptedException {
       driver.get("https://www.flipkart.com/");
       Thread.sleep(2000);
       driver.navigate().to("https://www.amazon.in/"); // driver.switchTo().frame(newFrame);

       Thread.sleep(2000);
       driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
       Thread.sleep(2000);

       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(2000);
       driver.navigate().refresh();

   }
   @AfterTest
    public void closeup(){
       driver.close();
   }

}
