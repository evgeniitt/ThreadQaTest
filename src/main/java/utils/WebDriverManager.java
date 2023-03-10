package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager {
    private static WebDriver driver = null;
    private static void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://85.192.34.140:8081/");
    }
    public static WebDriver getWd() {
        if (driver==null) {
            init();
        } return driver;
    }
}
