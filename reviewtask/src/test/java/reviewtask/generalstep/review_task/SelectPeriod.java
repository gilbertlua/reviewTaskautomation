package reviewtask.generalstep.review_task;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import reviewtask.driverfactory.DriverFactory;
import reviewtask.generalfunctions.GeneralAction;
import reviewtask.generalfunctions.SupportFunction;
import reviewtask.softassert.SoftAssert;


public class SelectPeriod{  
    WebDriver _driver = DriverFactory.GetDriver();
    public static void SelectThePeriod() {  
        SupportFunction.WaitElementVisible("#periodDropdown > div > div > div > div > div > input");      
        GeneralAction.Click("#periodDropdown > div > div > div > div > div > input");
        SupportFunction.TimeDelay(1000);
        GeneralAction.ButtonArrow(1, "#periodDropdown > div > div > div > div > div > input");
        GeneralAction.ButtonArrow(1, "#periodDropdown > div > div > div > div > div > input");
        SupportFunction.TimeDelay(1000);
        GeneralAction.SendEnter();
    }   
    public static void PeriodSelected() {
        String actual = GeneralAction.GetInputValue("#mui-2");
        String expected = "2023 - H2";
        Boolean check = SoftAssert.StringCompare(expected, actual);
        assertTrue(check);
    }
}
