import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.testng.AllureTestNg;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Selenium002 {
    @Test
     @Description("Test login with valid credentials")
    @Severity(SeverityLevel.CRITICAL) @Story("User Login")



            public void katlontest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeappbutton = driver.findElement(By.id("btn-make-appointment"));
        makeappbutton.click();
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement LoginButton = driver.findElement(By.xpath("//button [@class = 'btn btn-default']"));

        LoginButton.click();

        Thread.sleep(5000);

        WebElement userElement = driver.findElement(By.tagName("h2"));

        String actualText = userElement.getText();
        String expectedText= "Make Appointment";

        Assert.assertEquals(actualText, expectedText, "Login Failed!!");

        System.out.println("Login success");



        //driver.quit();

    }

    ////input[@name = 'username']

   /* https://www.sdetclub.com/c/atb15x-only/doubts-25-feb-mastering-xpath
    https://awesomeqa.com/hr/web/index.php/auth/login
    https://awesomeqa.com/hr/web/index.php/auth/login
    https://www.sdetclub.com/c/atb15x-only/task-25-feb-2026-selenium-katalon
    TTA Bank
            sign up
                    transfer amount*/
}
