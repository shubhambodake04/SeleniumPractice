
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass extends BrowserFactory {
    String url="https://en-gb.facebook.com/";
    @BeforeTest
    public void browserSetup()
    {

        initialisingBrowser("chrome",url);
    }
    @AfterTest
    public void closeup() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
