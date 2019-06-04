import org.junit.Before;
import org.openqa.selenium.By;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UIB01 {
    private WebDriver driver;
    private String baseUrl;
    WebElement checkBoxLnk = driver.findElement(By.xpath("//a[text()='Checkboxes']"));

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hientvo\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://the-internet.herokuapp.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void selectCheckboxes() {
        checkBoxLnk.click();
    }




}
