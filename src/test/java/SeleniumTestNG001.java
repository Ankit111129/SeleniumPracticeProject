import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTestNG001 {

    @Test

        public void test_Selenium_VMO()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        System.out.println(driver.getTitle());

    }

}
