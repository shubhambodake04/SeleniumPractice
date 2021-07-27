import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebTable_Example {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "start-maximized", "incognito");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Shubham\\IdeaProjects\\First_Automation\\WebTable.html");

        List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :"+ totalRows);

        List<WebElement> allColumn = driver.findElements(By.xpath("//th"));
        int totalColumn = allColumn.size();
        System.out.println("total number of column present in the table is :"+ totalColumn);

        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);

        int countNumberValue = 0;
        int sum=0;
        for (WebElement cell : allCells) {
            String cellValue = cell.getText();
            try{
                int number = Integer.parseInt(cellValue);
                System.out.println(" "+number);
                countNumberValue++;
                sum = sum+number;
            }catch (Exception e) {
            }
        }
        System.out.println("Total count of numeric values is :"+countNumberValue);
        System.out.println("Total sum of all the numeric values is :"+sum);

        driver.close();


    }
}
