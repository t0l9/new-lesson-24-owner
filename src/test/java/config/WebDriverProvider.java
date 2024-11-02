package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.function.Supplier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider implements Supplier<WebDriver> {

    private final WebDriverConfig config;

    public WebDriverProvider(final WebDriverConfig config) {
        this.config = new WebDriverConfig();
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    public WebDriver createDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
