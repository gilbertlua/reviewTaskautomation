package team_member.generalstep.consolidation_review;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import team_member.driverfactory.DriverFactory;
import team_member.generalfunctions.GeneralAction;
import team_member.generalfunctions.SupportFunction;
import team_member.softassert.SoftAssert;


public class Consolidation_LoadPage {
    WebDriver _driver = DriverFactory.GetDriver();
    
    public static void LoadConsolidationPage() {
        SupportFunction.TimeDelay(1000);
        GeneralAction.ClickMenuBar();
        SupportFunction.WaitElementVisible("#root > nav > ul > li:nth-child(4)");
        GeneralAction.Click("#root > nav > ul > li:nth-child(4)");
    }
    public static void ConsolidationPageLoaded() {
        SupportFunction.WaitElementVisible("#root > div.bodyContent > div > div > table > tbody > tr > td:nth-child(1)");
        String actual = GeneralAction.GetValue("#root > div.header > div.title");
        String expected = "Consolidated Reviews";        
        boolean check = SoftAssert.TitleCompare(expected,actual);
        assertTrue(check);
    }
}