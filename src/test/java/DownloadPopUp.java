import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class DownloadPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();String key = "browser.helperApps.neverAsk.saveToDisk";
        String value = "application/zip";
        profile.setPreference(key, value);
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", "D:\\Selenium");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[6]/a[1]")).click();
        Thread.sleep(3000);
        driver.quit();


        /*System.setProperty("webdriver.gecko.driver","geckodriver.exe");

        //Create Hashmap object and assign the profile settings
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "D:\\Selenium");

        //Assign this chromePrefs object with ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        //Create Capability object and assign the option object
        DesiredCapabilities cap = DesiredCapabilities.htmlUnit();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(cap);
        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[6]/a[1]")).click();
        driver.quit();*/
    }
}
