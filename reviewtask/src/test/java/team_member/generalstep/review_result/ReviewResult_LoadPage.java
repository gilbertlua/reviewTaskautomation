package team_member.generalstep.review_result;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;
import team_member.softassert.SoftAssert;


public class ReviewResult_LoadPage {
    WebDriver _driver = DriverFactory.GetDriver();
    
    public static void LoadReviewPage() {
        SupportFunction.TimeDelay(1000);
        GeneralAction.ClickMenuBar();
        SupportFunction.WaitElementVisible("#root > nav > ul > li:nth-child(3)");
        GeneralAction.Click("#root > nav > ul > li:nth-child(3)");
    }
    public static void ReviewPageLoaded() {
        SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div:nth-child(2) > h4");
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Review Result";        
        boolean check = SoftAssert.TitleCompare(expected,actual);
        assertTrue(check);
    }
}