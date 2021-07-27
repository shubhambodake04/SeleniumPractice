import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationTest_Class extends BaseClass {

    @Test(priority = 1)
    public void createAccount() throws InterruptedException, IOException {
        String birthDate = "4";
        String birthMonth = "Aug";
        String birthYear = "1998";
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Shubham");
        driver.findElement(By.name("lastname")).sendKeys("Bodake");
        driver.findElement(By.name("reg_email__")).sendKeys("7757929383");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Asdfgh@123");
        Select date = new Select(driver.findElement(By.name("birthday_day")));

        Thread.sleep(3000);
        Take.screenshot(driver,"xyz");

        date.selectByValue(birthDate);
        Select month = new Select(driver.findElement(By.name("birthday_month")));
        month.selectByVisibleText(birthMonth);
        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByValue(birthYear);
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

        Thread.sleep(3000);
        Take.screenshot(driver,"Registration");
    }

    @Test(priority = 3)
    public void getTitle()
    {
        String originalTitle = "Facebook – log in or sign up";
        String fetchedTitle = driver.getTitle();
        Assert.assertEquals(fetchedTitle,originalTitle);
    }

    @Test(priority = 2)
    public void fetchText() throws InterruptedException {

        //driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@class]")).getText();
        System.out.println(message);
    }

}
