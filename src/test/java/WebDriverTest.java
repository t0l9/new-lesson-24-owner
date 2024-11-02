import config.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;


    @BeforeEach
    void startDriver(){

        driver = new WebDriverProvider().get();
    }

    @Test
    void testGithub() {
        String title = driver.getTitle();
        assertEquals("GitHub · Build and ship software on a single, collaborative platform · GitHub",title);
        stopDriver();
    }

    @AfterEach
    public void stopDriver(){
        driver.quit();

    }




}
