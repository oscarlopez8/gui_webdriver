import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalculatorPage {

    private WebDriver driver;

    private static final String URL = "https://www.calculadora.org/";
    private static final By SCREEN_BY = By.cssSelector(".screen");

    public CalculatorPage() { driver = new ChromeDriver(); }

    public String getResult() {
        String result = driver.findElement(SCREEN_BY).getText();
        return result;
    }

    public String carryOutOperations(List<By> commands) {
        driver.get(URL);
        driver.manage().window().setSize(new Dimension(1038, 742));
        for (By byCommands : commands) {
            driver.findElement(byCommands).click();
        }
        String result = getResult();
        driver.quit();
        return result;
    }
}
