package team_member.generalstep.review_result;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;
import team_member.softassert.SoftAssert;


public class ReviewResult_SelectPeriod{  
    WebDriver _driver = DriverFactory.GetDriver();
    public static void SelectThePeriod() {  
        SupportFunction.WaitElementVisible("#periodDropdown > div > div > div > div > div > input");      

        SupportFunction.WaitElementVisible("#periodDropdown > div > div > div > div > div > input");      
        GeneralAction.Click("#periodDropdown > div > div > div > div > div > input");
        SupportFunction.TimeDelay(1000);
        GeneralAction.SendKey("#periodDropdown > div > div > div > div > div > input", "2023 - H2");
        SupportFunction.TimeDelay(1000);
        GeneralAction.ButtonArrow(1, "#periodDropdown > div > div > div > div > div > input");
        GeneralAction.SendEnter();
    }   
    public static void PeriodSelected() {
        String actual = GeneralAction.GetInputValue("#periodDropdown > div > div > div > div > div > input");
        String expected = "2023 - H2";
        Boolean check = SoftAssert.StringCompare(expected, actual);
        assertTrue(check);
    }
}

