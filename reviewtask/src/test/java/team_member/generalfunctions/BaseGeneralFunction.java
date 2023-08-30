package team_member.generalfunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import team_member.driverfactory.DriverFactory;

public class BaseGeneralFunction {
    static WebDriver _driver = DriverFactory.GetDriver();
    WebElement usageElement;
}


