import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ChildBrowserPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");

        String windowHandleID = driver.getWindowHandle();
        System.out.println(windowHandleID);
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : "+ count);

        for (String windowHandle : allWindowHandles) {
             //switch to each browser window
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            //print the window handle id of each browser window
            System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
            //close all the browsers one by one
            driver.close();
        }



        //close all the child browser windows except the main browser.
       /* String parentWindowhandleID = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();System.out.println("Number of browser windows opened on the system is : "+ count);
        for (String windowHandle : allWindowHandles) {
            //switch to each browser window
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            //compare the window id of all the browsers with the Parent browser window id, if it is not equal, then only close the browser windows.
            if (!windowHandle.equals(parentWindowhandleID)) {
                driver.close();
                System.out.println("Child Browser window with title -->"+ title +" --> is closed");
            }} */


    }
}