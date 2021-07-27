import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);  //switch to frame if it is present
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().perform();
}}
