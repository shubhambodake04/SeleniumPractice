import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class StudentMarks {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "start-maximized", "incognito");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Shubham\\IdeaProjects\\First_Automation\\StudentMarks.html");

        List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :"+ totalRows);

        List<WebElement> allColumn = driver.findElements(By.xpath("//th"));
        int totalColumn = allColumn.size();
        System.out.println("total number of column present in the table is :"+ totalColumn);

        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);

        int sum = 0;
        for (int index=2; index<= allRows.size()-1; index++){
            String mark = driver.findElement(By.xpath("//tr[" +index + "]/td[3]")).getText();
            try{
                int number = Integer.parseInt(mark);
                System.out.println(" " +mark);
                sum +=number;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Total Sum :" + sum);

        String totalmarks = driver.findElement(By.xpath("//tr[" +totalRows + "]/td[3]")).getText();
        int totalMark = Integer.parseInt(totalmarks);
        if (sum == totalMark)
            System.out.println("Sum of marks are equal");
        else
            System.out.println("Sum of marks are not equal");
        driver.quit();


         /* String physicsMarks = driver.findElement(By.xpath("//tr[2]/td[3]")).getText();
        String mathsMarks = driver.findElement(By.xpath("//tr[3]/td[6]")).getText();
        String chemistryMarks = driver.findElement(By.xpath("//tr[4]/td[9]")).getText();

        int pMarks = Integer.parseInt(physicsMarks);
        int mMarks = Integer.parseInt(mathsMarks);
        int cMarks = Integer.parseInt(chemistryMarks);
        int sum = pMarks+mMarks+cMarks;

        String totalMarks = driver.findElement(By.xpath("//tr[5]/td[3]")).getText();
        int tMarks = Integer.parseInt(totalMarks);

        if (sum == tMarks)
            System.out.println("Sum of marks are equal");
        else {
            System.out.println("Sum of marks are not equal");
        }

*/



    }}
