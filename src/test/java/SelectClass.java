import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions eoptions = new EdgeOptions();
        System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
        driver = new EdgeDriver(eoptions);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php");

        Select select = new Select(driver.findElement(By.id("day")));
        select.selectByIndex(1);
        List<WebElement> options= select.getOptions();
        int totalDays = options.size();
        System.out.println("Number of days inside the listbos is :" +totalDays);
        for(WebElement element: options){
            String day_d1 = element.getText();
            System.out.println(day_d1);
        }
        Thread.sleep(1000);


        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("ऑग");
        List<WebElement> options1= month.getOptions();
        int totalMonths = options1.size();
        System.out.println("Number of Months inside the listbos is :" +totalMonths);
        for(WebElement element: options1){
            String month_m = element.getText();
            System.out.println(month_m);
        }
        Thread.sleep(1000);


        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("1998");
        List<WebElement> options2= year.getOptions();
        int totalYears = options2.size();
        System.out.println("Number of Years inside the listbos is :" +totalYears);
        for(WebElement element: options2){
            String year_y = element.getText();
            System.out.println(year_y);
        }
        Thread.sleep(100);


        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        int size = allSelectedOptions.size();
        System.out.println("Number of items that is selected in the list box is : "+size);
        System.out.println(" Selected items are printed below: ");
        for (WebElement webElement : allSelectedOptions) {
            System.out.println(webElement.getText());
        }
        driver.quit();
    }
}