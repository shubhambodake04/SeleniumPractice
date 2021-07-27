import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class FindElements {
    public static void main(String[] args){
    ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "start-maximized", "incognito");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/seeker/registration");

        //findElements() method returns list of web element
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int totalLinks = allLinks.size();
        System.out.println("total number of links present on the web page is : "+totalLinks);

        int visibleLinkCount = 0;
        int hiddenLinkCount = 0;
        for (WebElement link : allLinks) {
                if (link.isDisplayed()) {
                    visibleLinkCount++;
                    System.out.println(visibleLinkCount+" --> "+link.getText());
                }else{
                    hiddenLinkCount++;
                }
        }
        System.out.println("Total number of visible links :" + visibleLinkCount);
        System.out.println("Total number of hidden links :" + hiddenLinkCount);
        driver.close();

    }
}
