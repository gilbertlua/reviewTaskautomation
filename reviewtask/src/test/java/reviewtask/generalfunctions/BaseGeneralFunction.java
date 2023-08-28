package reviewtask.generalfunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reviewtask.driverfactory.DriverFactory;

public class BaseGeneralFunction {
    static WebDriver _driver = DriverFactory.GetDriver();
    WebElement usageElement;
}


