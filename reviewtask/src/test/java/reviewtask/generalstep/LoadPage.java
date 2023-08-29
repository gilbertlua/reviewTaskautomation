package reviewtask.generalstep;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import reviewtask.driverfactory.DriverFactory;
import reviewtask.generalfunctions.GeneralAction;
import reviewtask.generalfunctions.SupportFunction;
import reviewtask.softassert.SoftAssert;


public class LoadPage {
    WebDriver _driver = DriverFactory.GetDriver();
    
    public static void LoadReviewPage() {
        SupportFunction.TimeDelay(1000);
        GeneralAction.ClickMenuBar();
        SupportFunction.WaitElementVisible("#root > nav > ul > li:nth-child(2)");
        GeneralAction.Click("#root > nav > ul > li:nth-child(2)");
    }
    public static void ReviewPageLoaded() {
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Review Task";        
        boolean check = SoftAssert.TitleCompare(expected,actual);
        assertTrue(check);
    }
}