
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();

        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();     //click on ok
        //alert.dismiss();   //click on cancel  */


        //File Upload Pop up
        driver.get("https://html.com/input-type-file/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Shubham\\Downloads\\shubham-converted.docx");
        Thread.sleep(2000);
    }
}