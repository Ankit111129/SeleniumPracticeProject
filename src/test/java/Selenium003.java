import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.stream.Stream;

public class Selenium003 {


    @Test

    public void test_app_vmo()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        String title = driver.getTitle();
        System.out.println(title);
        String CurrentUrl =  driver.getCurrentUrl();
        System.out.println(CurrentUrl);
        String PageSource = driver.getPageSource();
       // System.out.println(PageSource);
        driver.quit();

    }



}
