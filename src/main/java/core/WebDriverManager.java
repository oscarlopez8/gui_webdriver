package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private WebDriver webDriver;
    private static WebDriverManager instance = null;

    public WebDriverManager () {
        initialize();
    }

    private void initialize() {
        this.webDriver = new ChromeDriver();
    }

    public WebDriver getWebDriver () {
        return webDriver;
    }

    public static  WebDriverManager getInstance() {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return  instance;
    }

    public void quitDriver() {
        webDriver.quit();
        webDriver = null;
    }
}
