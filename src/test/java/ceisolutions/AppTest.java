package ceisolutions;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private String appUrl = "https://www.google.com";
    private WebDriver driver;
    
    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        this.driver.close();
    }

    @Test
    public void testGoogle() {
        driver.navigate().to(this.appUrl);
        driver.findElement(By.name("q")).sendKeys("Azure Pipelines");
        driver.findElement(By.name("q")).submit();
        assertTrue("Verified title of page", driver.getTitle().contains("Azure Pipelines"));
    }
}
