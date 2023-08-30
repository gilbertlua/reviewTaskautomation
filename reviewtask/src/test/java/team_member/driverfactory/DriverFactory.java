package team_member.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver _driver;

    
    public static WebDriver GetDriver() {
        if (_driver == null) {
            _driver = new ChromeDriver();
        }
        return _driver;
    }
}
